package sourcefu.VBA.helpers;

public class DeadStoreStatement {
	public DeadStoreStatement(Integer stmtStart, Integer stmtStop, String varName, Integer varNameTokenIndex) {
		super();
		this.stmtStart = stmtStart;
		this.stmtStop = stmtStop;
		this.varName = varName;
		this.varNameTokenIndex = varNameTokenIndex; 
		//this.toErase = toErase;
	}
	Integer stmtStart;
	Integer stmtStop;
	String varName;
	Integer varNameTokenIndex;
	public Integer getVarNameTokenIndex() {
		return varNameTokenIndex;
	}
	public void setVarNameTokenIndex(Integer varNameTokenIndex) {
		this.varNameTokenIndex = varNameTokenIndex;
	}
	Boolean toErase = true;
	
	public Integer getStmtStart() {
		return stmtStart;
	}
	public void setStmtStart(Integer stmtStart) {
		this.stmtStart = stmtStart;
	}
	public Integer getStmtStop() {
		return stmtStop;
	}
	public void setStmtStop(Integer stmtStop) {
		this.stmtStop = stmtStop;
	}
	public String getVarName() {
		return varName;
	}
	public void setVarName(String varName) {
		this.varName = varName;
	}
	public Boolean getToErase() {
		return toErase;
	}
	public void setToErase(Boolean toErase) {
		this.toErase = toErase;
	}
}
