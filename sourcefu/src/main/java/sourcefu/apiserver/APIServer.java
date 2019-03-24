package sourcefu.apiserver;
import static spark.Spark.*;

import java.io.InputStream;

import javax.servlet.MultipartConfigElement;

import sourcefu.database.Analysis;
import sourcefu.database.AnalysisController;
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
                                
                                InputStream analysisFileStream = request.raw().getPart("analysisfile").getInputStream();
                                String analysisData = IOUtils.toString(analysisFileStream);
                                
                                Analysis analysis = new Analysis(analysisName, analysisLanguage, analysisData);                                
                                int i = AnalysisController.createAnalysis(analysis);
                                
                                System.out.println(AnalysisController.getAnalyses());
                                
                                if(i > 0) {
                                    response.type("application/json");
                                    return "{\"upload\":\"OK\"}";
//                                    response.status(200);
//                                    response.put("code", 200);
//                                    response.put("status", "Account Creation Successful! Proceed to Login");
                                } else {
                                    response.type("application/json");
                                    return "{\"upload\":\"FAIL\"}";
//                                    logger.error("ERROR! Unable to create User " + user.toString());
//                                    response.put("code", "401");
//                                    response.put("status", "ERROR! username/email exists already!");
//                                    res.status(401);
                                }
                            });
                        /*
                        //createNewStep
                        // used to create a new step in the analysis
                        post("/createNewStep", (request,response) -> {
                                request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
                                try (InputStream is = request.raw().getPart("uploaded_file").getInputStream()) {
                                        //use request
                                 }       

                                response.type("application/json");
                                return "{\"upload\":\"OK\"}";
                            });
						*/
                        //getAnalysisSteps
                        // used to get all steps of an analysis
                        get("/AnalysisSteps/:analysisId", (request,response) -> {
                                //TODO
                                return "OK";
                            });

                        get("/AnalysisStep/:analysisId/:stepId", (request, response) -> {
                                //TODO
                                return "OK";
                            });
                        
                        put("/launchCommand/:analysisId/:stepId/:commandId", (request, response) -> {
                                //TODO
                                return "OK";
                            });

                        get("/LastCommandStatus/:analysisId", (request, response) -> {
                                //TODO
                                return "OK";
                            });

                        get("/LastCommandResult/:analysisId", (request, response) -> {
                                //TODO
                                return "OK";
                            });

                        get("/analysisStatus/:analysisId", (request, response) -> {
                                //TODO
                                return "OK";
                            });

                        
                        put("setDeobfuscated/:analysisId", (request, response) -> {
                                //TODO
                                return "OK";
                            });
                    });
            });
    }
}
