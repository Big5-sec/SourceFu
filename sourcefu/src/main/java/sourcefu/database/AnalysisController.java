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
		
}
