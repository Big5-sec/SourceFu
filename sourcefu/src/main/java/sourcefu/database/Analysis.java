package sourcefu.database;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("analysis_tbl")
public class Analysis {
	@Id
	private ObjectId id; //eheh mongodb don't do the autoincrement thing, so we need to do it by yourselves
	private String name;
	private String language;
	private String filename = "coucou";
	private String originalData;
	private enum status {
		unanalysed, ongoing, finished;
	}
	private Step currentStep;
	
	public Analysis() {}
	
	public Analysis(String name, String language) {
		this.setName(name);
		this.setLanguage(language);
	}
	
	public Analysis(String name, String language, String originalData) {
		this(name,language);
		this.originalData = originalData;
	}
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOriginalData() {
		return originalData;
	}

	public void setOriginalData(String originalData) {
		this.originalData = originalData;
	}

	public Step getCurrentStep() {
		return currentStep;
	}

	public void setCurrentStep(Step currentStep) {
		this.currentStep = currentStep;
	}

	public String getOriginalFilename() {
		return filename;
	}

	public void setOriginalFilename(String originalFilename) {
		this.filename = originalFilename;
	}

}
