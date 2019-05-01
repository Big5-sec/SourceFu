package sourcefu.database;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("analysis_tbl")
public class Analysis {
	@Id
	private ObjectId id; //eheh mongodb don't do the autoincrement thing, so we need to do it by yourselves
	private String name;
	private String language;
	private String filename;
	private String originalData;
	private enum status {
		unanalysed, ongoing, finished;
	}
	private Step currentStep;
	List<Step> steps = new ArrayList<Step>();
	
	public Analysis() {}
	
	public Analysis(String name, String language) {
		this.setName(name);
		this.setLanguage(language);
	}
	
	public Analysis(String name, String language, String filename, String originalData) {
		this(name,language);
		this.filename = filename;
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

	public String getFilename() {
		return filename;
	}

	public void setFilename(String originalFilename) {
		this.filename = originalFilename;
	}

	public void addStepAndSetCurrent(Step step) {
		this.steps.add(step);
		setCurrentStep(step);
	}
	
	
}
