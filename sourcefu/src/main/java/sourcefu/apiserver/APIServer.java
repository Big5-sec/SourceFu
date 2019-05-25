package sourcefu.apiserver;
import static spark.Spark.*;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.MultipartConfigElement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import sourcefu.VBA.helpers.VBAAPIUtils;
import sourcefu.database.Analysis;
import sourcefu.database.AnalysisController;
import sourcefu.database.Step;
import spark.utils.IOUtils;

public class APIServer {

	public APIServer () {

		path("/api", () -> {
			path("/analysis", () -> {
				//newAnalysis
				// used to create a new analysis in our server
				post("/newAnalysis", (request, response) -> {
					request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
					InputStream analysisNameStream = request.raw().getPart("analysisname").getInputStream();
					String analysisName = IOUtils.toString(analysisNameStream);

					InputStream analysisLanguageStream = request.raw().getPart("analysislanguage").getInputStream();
					String analysisLanguage = IOUtils.toString(analysisLanguageStream);

					String analysisFilename = request.raw().getPart("analysisfile").getSubmittedFileName();

					InputStream analysisFileStream = request.raw().getPart("analysisfile").getInputStream();
					String analysisData = IOUtils.toString(analysisFileStream);

					Analysis analysis = new Analysis(analysisName, analysisLanguage, analysisFilename, analysisData);                                
					String ret = AnalysisController.createAnalysis(analysis);
					if(ret.equals("fail")) {
						response.type("application/json");
						return "{\"status\":\"FAIL\"}";
					}
					int i = AnalysisController.setOriginalStep(ret, analysisData);
					if(i == 0) {
						response.type("application/json");
						return "{\"status\":\"OK\"}";
					} else {
						response.type("application/json");
						return "{\"status\":\"FAIL\"}";
					}
				});

				//createNewStep
				// used to create a new step in the analysis
				post("/createNewStep", (request,response) -> {
					System.out.println("calling new step");
					request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
					InputStream stepNameStream = request.raw().getPart("name").getInputStream();
					String stepName = IOUtils.toString(stepNameStream);

					InputStream stepCodeStream = request.raw().getPart("code").getInputStream();
					String stepCode = IOUtils.toString(stepCodeStream);

					InputStream analysisIdStream = request.raw().getPart("analysisId").getInputStream();
					String analysisId = IOUtils.toString(analysisIdStream);

					int i = AnalysisController.setNewStep(analysisId, stepName, stepCode);
					if(i == 0) {
						response.type("application/json");
						return "{\"status\":\"OK\"}";
					} else {
						response.type("application/json");
						return "{\"status\":\"FAIL\"}";
					}
				});

				//getAnalysisSteps
				// used to get all steps of an analysis
				get("/AnalysisSteps/:analysisId", (request,response) -> {
					//TODO
					return "OK";
				});

				get("/AnalysisStep/:analysisId/:stepId", (request, response) -> {
					System.out.println("calling get one step from analysis");
					String analysisId = request.params(":analysisId");
					String stepId = request.params(":stepId");
					Step i = AnalysisController.getAnalysisStep(analysisId, stepId);
					if(i != null) {
						Map<String, String> output = new HashMap<String, String>();
						output.put("status", "OK");
						output.put("code",i.getCode());
						GsonBuilder builder = new GsonBuilder();
						Gson gson = builder.create();
						String json = gson.toJson(output);
						return json;
					} else {
						return "{\"status\":\"FAIL\",\"error\":\"step not found\"}";
					}
						
				});

				get("/delAnalysis/:analysisId", (request, response) -> {
					String analysisId = request.params("analysisId");
					int i = AnalysisController.deleteAnalysis(analysisId);
					if(i == 0) {
						response.type("application/json");
						return "{\"status\":\"OK\"}";
					} else {
						response.type("application/json");
						return "{\"status\":\"FAIL\"}";
					}
				});

			});
			path("/actions", () -> {
				post("/deleteComments", (request, response) -> {
					request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
					InputStream inputStream = request.raw().getPart("input").getInputStream();
					String input = IOUtils.toString(inputStream);
					VBAAPIUtils api = new VBAAPIUtils();
					String data = api.APIDeleteComments(input);

					if(data != null) {
						Map<String, String> output = new HashMap<String, String>();
						output.put("status", "OK");
						output.put("output",data);
						GsonBuilder builder = new GsonBuilder();
						Gson gson = builder.create();
						String json = gson.toJson(output);
						return json;
					} else {
						return "{\"status\":\"FAIL\",\"output\":\"\"}"; 
					}

				});
			});   
		});
	}
}
