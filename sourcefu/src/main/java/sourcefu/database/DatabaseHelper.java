package sourcefu.database;

import com.mongodb.MongoClient;

import dev.morphia.Datastore;
import dev.morphia.Morphia;
import sourcefu.webserver.WebUtils;

public class DatabaseHelper {

	/**
	 * Constructor 
	 * cloud contacts
	 */
	private static Morphia morphia = new Morphia();
	private static Datastore datastore = null;

	public DatabaseHelper() {
		//		if(!morphia.isMapped(Contact.class)) {
		//			morphia.map(Contact.class);
		//                        morphia.map(User.class);
		//			initDatastore();
		//		} else {
		//			logger.info("Database Class Mapped Already!");
		//		}
		morphia.mapPackage("sourcefu.database");
	}



	void initDatastore() {
		MongoClient mongoClient;
		mongoClient = new MongoClient(WebUtils.Database.HOST, WebUtils.Database.PORT);
		datastore = morphia.createDatastore(mongoClient, WebUtils.Database.LOCAL_DBNAME);
		datastore.ensureIndexes();
	}


	public Datastore getDataStore() {
		if(datastore == null) {
			initDatastore();
		}
		return datastore;
	}

}
