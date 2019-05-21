package sourcefu.database;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("steps_tbl")
public class Step {
	@Id
	private ObjectId id;
	private String analysisId;
	private String name;
	private String code;
	private Step parentStep;
	
	public Step() {}
	
	public Step(String analysisId, String name, String code, Step parentStep) {
		this.analysisId = analysisId;
		this.name = name;
		this.code = code;
		this.parentStep = parentStep;
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getAnalysisId() {
		return analysisId;
	}
	public void setAnalysisId(String analysisId) {
		this.analysisId = analysisId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Step getParentStep() {
		return parentStep;
	}
	public void setParentStep(Step parentStep) {
		this.parentStep = parentStep;
	}
	
	

}
