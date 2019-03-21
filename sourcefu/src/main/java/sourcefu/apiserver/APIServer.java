package sourcefu.apiserver;
import static spark.Spark.*;

public class APIServer {
    
    public APIServer () {
    	
    	path("/api", () -> {
                path("/analysis", () -> {
                        //newAnalysis
                        // used to create a new analysis in our server
                        /*post("/newAnalyis", (request, response) -> {
                                request.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/tmp"));
                                try (InputStream is = request.raw().getPart("uploaded_file").getInputStream()) {
                                        //use request
                                 }       

                                response.type("application/json");
                                return "{\"upload\":\"OK\"}";
                            });

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
