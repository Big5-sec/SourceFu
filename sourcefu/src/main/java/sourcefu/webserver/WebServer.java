package sourcefu.webserver;
import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;

import sourcefu.apiserver.APIServer;
import sourcefu.database.Analysis;
import sourcefu.database.AnalysisController;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import spark.utils.StringUtils;

public class WebServer {
    
    public WebServer () {
    	staticFiles.location("/public");
        get("/", (req, res) -> renderHomePage());
        get("/newAnalysis", (req, res) -> renderNewAnalysisPage());
        get("/editAnalysis/:analysisId", (req, res) -> renderEditAnalysis());//Integer.parseInt(req.params("analysisId"))));
        get("/workAnalysis/:analysisId", (req, res) -> renderWorkAnalysis(req.params("analysisId")));//Integer.parseInt(req.params("analysisId"))));
    	APIServer apiServer = new APIServer();
    }

	private static String renderTemplate(String template, Map model) {
        return new VelocityTemplateEngine().render(new ModelAndView(model, template));
    }
	
    private static String renderHomePage(){
        Map<String, Object> model = new HashMap<>();
        model.put("analyses", AnalysisController.getAnalyses());
        return renderTemplate(WebUtils.Templates.HOME,model);
    }
    
    private String renderNewAnalysisPage() {
        Map<String, Object> model = new HashMap<>();
        return renderTemplate(WebUtils.Templates.NEWANALYSIS,model);
 	}

    private static String renderEditAnalysis(/*Integer analysisId*/){
        Map<String, Object> model = new HashMap<>();
        return renderTemplate(WebUtils.Templates.EDITANALYSIS,model);
    }

    private static String renderWorkAnalysis(String analysisId){
        Map<String, Object> model = new HashMap<>();
        Analysis analysis = AnalysisController.getAnalysisById(analysisId);
        model.put("original", StringEscapeUtils.escapeHtml(analysis.getOriginalData()));
        model.put("analysisId",analysisId);
        model.put("current_step", analysis.getCurrentStep());
        model.put("current_step_code", StringEscapeUtils.escapeHtml(analysis.getCurrentStep().getCode()));
        model.put("steps_name", analysis.getStepsName());
        model.put("analysis_filename",analysis.getFilename());
        model.put("analysis_language", analysis.getLanguage());
        return renderTemplate(WebUtils.Templates.WORKANALYSIS,model);
    }
}

    

