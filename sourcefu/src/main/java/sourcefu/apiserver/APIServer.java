package sourcefu.apiserver;
import static spark.Spark.*;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.MultipartConfigElement;

import org.apache.commons.lang.StringEscapeUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import sourcefu.JS.helpers.JSAPIUtils;
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
					analysisData = StringEscapeUtils.unescapeHtml(analysisData);
					
					if(analysisLanguage.contains("Try to auto-determine")) {
						String language = new APIServerUtils().getSampleLanguage(analysisData);
						if (!language.equals("undefined")) {
							analysisLanguage = language;
							System.out.println("detected language for analysis : " + analysisLanguage);
						} else {
							response.type("application/json");
							return "{\"status\":\"FAIL\",\"error\":\"could not set language automatically\",\"error_id\":\"3\"}";
						}
					}
					
					if(analysisLanguage.equals("Javascript")) {  //TODO: we should set the language as part of an enum instead
						analysisLanguage = "JS";
					}
					
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
					request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
					InputStream stepNameStream = request.raw().getPart("name").getInputStream();
					String stepName = IOUtils.toString(stepNameStream);

					InputStream stepCodeStream = request.raw().getPart("code").getInputStream();
					String stepCode = IOUtils.toString(stepCodeStream);
					stepCode = StringEscapeUtils.unescapeHtml(stepCode);

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
						output.put("code",StringEscapeUtils.escapeHtml(i.getCode()));
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
				/* the following code is a bit outdated, don't care*/
//				post("/deleteComments", (request, response) -> {
//					request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
//					InputStream inputStream = request.raw().getPart("input").getInputStream();
//					String input = IOUtils.toString(inputStream);
//					VBAAPIUtils api = new VBAAPIUtils();
//					String data = api.APIDeleteComments(input);
//
//					if(data != null) {
//						Map<String, String> output = new HashMap<String, String>();
//						output.put("status", "OK");
//						output.put("output",data);
//						GsonBuilder builder = new GsonBuilder();
//						Gson gson = builder.create();
//						String json = gson.toJson(output);
//						return json;
//					} else {
//						return "{\"status\":\"FAIL\",\"output\":\"\"}"; 
//					}
//
//				});
				
				post("/newOperation", (request, response) -> {
					request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
					InputStream codeStream = request.raw().getPart("code").getInputStream();
					String code = IOUtils.toString(codeStream);
					code = StringEscapeUtils.unescapeHtml(code);

					InputStream operationStream = request.raw().getPart("operation").getInputStream();
					String operation = IOUtils.toString(operationStream);

					InputStream setNewStepStream = request.raw().getPart("setnewstep").getInputStream();
					String setNewStepStr = IOUtils.toString(setNewStepStream);
					boolean setNewStep = false;
					if(setNewStepStr.equals("true")) {
						setNewStep = true;
					}
					
					InputStream analysisIdStream = request.raw().getPart("analysisId").getInputStream();
					String analysisId = IOUtils.toString(analysisIdStream);
					
					Analysis analysis = AnalysisController.getAnalysisById(analysisId);		
					String newData = "";
					if(analysis.getLanguage().equals("VBA")) {
						VBAAPIUtils api = new VBAAPIUtils();
						if(operation.equals("delete comments")) {
							newData = api.APIDeleteComments(code);
						} else if (operation.equals("rename variables (based on scope)")) {
							newData = api.APIRename(code);
						} else if (operation.equals("dead code elimination")) {
							newData = api.APIDeadStore(code);
						} else if (operation.equals("beautify")) {
							newData = api.APIBeautify(code);
						} else if (operation.equals("expressions evaluation")) {
							newData = api.APIExprEval(code);
						} else if (operation.equals("cfg simplifications")) {
							newData = api.APISimplify(code);
						} else if (operation.equals("full analysis")) {
							newData = api.APIFullAnalysis(code);
						} else if (operation.equals("empty blocks removal")) {
							newData = api.APIEMptyBlockRemoval(code);
						} else {
							return "{\"status\":\"FAIL\",\"error\":\"no operation matches the asked one\"}";
						}
					} else if(analysis.getLanguage().equals("JS")) {
						JSAPIUtils api = new JSAPIUtils();
						if(operation.equals("delete comments")) {
							//newData = api.APIDeleteComments(code);
						} else if (operation.equals("rename variables (based on scope)")) {
							newData = api.APIRename(code);
						} else if (operation.equals("dead code elimination")) {
							//newData = api.APIDeadStore(code);
						} else if (operation.equals("beautify")) {
							//newData = api.APIBeautify(code);
						} else if (operation.equals("expressions evaluation")) {
							//newData = api.APIExprEval(code);
						} else if (operation.equals("cfg simplifications")) {
							//newData = api.APISimplify(code);
						} else if (operation.equals("full analysis")) {
							//newData = api.APIFullAnalysis(code);
						} else if (operation.equals("empty blocks removal")) {
							//newData = api.APIEMptyBlockRemoval(code);
						} else {
							return "{\"status\":\"FAIL\",\"error\":\"no operation matches the asked one\"}";
						}
					} else {
						return "{\"status\":\"FAIL\",\"error\":\"no operation for the associated language\"}";
					}
					
					if(setNewStep && newData.length()!=0) {
						AnalysisController.setNewStep(analysisId, "post " + operation, newData);
					}
					
					if(newData.length()!=0) {
						Map<String, String> output = new HashMap<String, String>();
						output.put("status", "OK");
						output.put("output",StringEscapeUtils.escapeHtml(newData));
						GsonBuilder builder = new GsonBuilder();
						Gson gson = builder.create();
						String json = gson.toJson(output);
						return json;
					}
					
					return "{\"status\":\"FAIL\",\"output\":\"\"}";
				});
				
			});   
		});
	}
}
