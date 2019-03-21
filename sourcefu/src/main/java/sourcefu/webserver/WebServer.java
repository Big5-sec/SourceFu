package sourcefu.webserver;
import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import sourcefu.apiserver.APIServer;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class WebServer {
    
    public WebServer () {
    	staticFiles.location("/public");
        get("/", (req, res) -> renderHomePage());
//        get("/editAnalysis/:analysisId", (req, res) -> renderEditAnalysis(req.params("analysisId")));
//        get("/workAnalysis/:analysisId", (req, res) -> renderWorkAnalysis(req.params("analysisId")));
//    }
    	APIServer apiServer = new APIServer();
    	
    	//get("/", (req, res) -> { return "welcome";});
    }


    private static String renderTemplate(String template, Map model) {
        return new VelocityTemplateEngine().render(new ModelAndView(model, template));
    }
	
    private static String renderHomePage(){
        Map<String, Object> model = new HashMap<>();
        return renderTemplate(WebUtils.Templates.HOME,model);
    }
}
/*
    private static renderEditAnalysis(Integer analysisId){
        Map<String, Object> model = new HashMap<>();
        return renderTemplate("velocity/analysis_edit.vm",model);
    }

    private static renderWorkAnalysis(Integer analysisId){
        Map<String, Object> model = new HashMap<>();
        return renderTemplate("velocity/analysis_work.vm",model);
    }*/
    

