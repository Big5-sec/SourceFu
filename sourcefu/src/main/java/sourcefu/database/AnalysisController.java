package sourcefu.database;

import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.DuplicateKeyException;

import dev.morphia.Datastore;

public class AnalysisController {
	
	 static DatabaseHelper dbHelper = new DatabaseHelper();
	 static Datastore ds;

	public static int createAnalysis(Analysis analysis) {
	      if(analysis == null) return -1;
	       ds = dbHelper.getDataStore();
	       try {
	        ds.save(analysis);
	       } catch(DuplicateKeyException e) {
	           return -2;
	       }
	       return 1;
	   
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
		System.out.println("setting new step with " + stepName + " ; " + stepCode);
		Step step = new Step(analysisId, stepName, stepCode, null);
		analysis.addStepAndSetCurrent(step);
		System.out.println(analysis.getCurrentStep());
		ds.save(analysis);
		return 0;
	}
	
}
