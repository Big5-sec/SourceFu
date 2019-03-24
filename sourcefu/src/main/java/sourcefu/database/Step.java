package sourcefu.database;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("steps_tbl")
public class Step {
	@Id
	private ObjectId id;
	private int analysisId;
	private String name;
	private String data;
	private Step parentStep;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public int getAnalysisId() {
		return analysisId;
	}
	public void setAnalysisId(int analysisId) {
		this.analysisId = analysisId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Step getParentStep() {
		return parentStep;
	}
	public void setParentStep(Step parentStep) {
		this.parentStep = parentStep;
	}
	
	

}
