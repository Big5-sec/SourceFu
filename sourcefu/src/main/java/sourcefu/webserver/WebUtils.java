package sourcefu.webserver;

public class WebUtils {
	
	public WebUtils() {}
	
	public static class Templates {
		public static String HOME = "templates/home.vm";
		public static String NEWANALYSIS = "templates/newanalysis.vm";
		public static String WORKANALYSIS = "templates/workanalysis.vm";
		public static String EDITANALYSIS = "templates/editanalysis.vm";
	}
	
	public static class Database {
		public static String HOST = "localhost";
		public static int PORT = 27017;
		public static String LOCAL_DBNAME = "sourcefu_db";
	}
}
