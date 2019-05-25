package sourcefu.database;

import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.DuplicateKeyException;

import dev.morphia.Datastore;

public class AnalysisController {
	
	 static DatabaseHelper dbHelper = new DatabaseHelper();
	 static Datastore ds;

	public static String createAnalysis(Analysis analysis) {
	      if(analysis == null) return "fail";
	       ds = dbHelper.getDataStore();
	       try {
	        return ds.save(analysis).getId().toString();
	       } catch(DuplicateKeyException e) {
	           return "fail";
	       }
	} 
	
	public static List<Analysis> getAnalyses() {
		ds = dbHelper.getDataStore();
		List<Analysis> analysesList = ds.createQuery(Analysis.class).asList();
		return analysesList;
	}
	
	public static String getOriginalData(String analysisId) {
		ds = dbHelper.getDataStore();
		ObjectId id = new ObjectId(analysisId);
		Analysis analysis = ds.createQuery(Analysis.class).field("id").equal(id).get();
		return analysis.getOriginalData();
	}
	
	public static Step getAnalysisStep(String analysisId, String stepId) {
		ds = dbHelper.getDataStore();
		ObjectId id = new ObjectId(analysisId);
		Analysis analysis = ds.createQuery(Analysis.class).field("id").equal(id).get();
		return analysis.getStepbyName(stepId);
	}
		
	public static Analysis getAnalysisById(String analysisId) {
		ds = dbHelper.getDataStore();
		ObjectId id = new ObjectId(analysisId);
		Analysis analysis = ds.createQuery(Analysis.class).field("id").equal(id).get();
		return analysis;
	}
	
	public static int deleteAnalysis(String analysisId) {
		ds = dbHelper.getDataStore();
		ObjectId id = new ObjectId(analysisId);
		Analysis analysis = ds.createQuery(Analysis.class).field("id").equal(id).get();
		if (analysis != null) {
//			for(Step step: analysis.getSteps()) {
//				Step pstep= ds.createQuery(Step.class).field("id").equal(step.getId()).get();
//				ds.delete(pstep);
//			}
			ds.delete(analysis);
			return 0;
		}
		return 1;
	}

	public static int setNewStep(String analysisId, String stepName, String stepCode) {
		ds = dbHelper.getDataStore();
		ObjectId id = new ObjectId(analysisId);
		Analysis analysis = ds.createQuery(Analysis.class).field("id").equal(id).get();
		if (analysis == null) {
			return 1;
		}
		Step parentStep = analysis.getCurrentStep();
		Step step = new Step(analysisId, stepName, stepCode, parentStep);
		analysis.addStepAndSetCurrent(step);
		System.out.println(analysis.getCurrentStep());
		ds.save(analysis);
		return 0;
	}
	
	public static int setOriginalStep(String analysisId, String originalData) {
		int i = setNewStep(analysisId, "original", originalData);
		return i;
	}
	
}
