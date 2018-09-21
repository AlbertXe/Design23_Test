package g_adapter.example3;

public class LogModel {
	private String logId;
	
	private String operateUser;
	
	private String operateTime;
	
	private String logContent;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	
	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	@Override
	public String toString() {
		return "LogModel [logId=" + logId + ", opetateUser=" + operateUser + ", operateTime=" + operateTime + ", logContent=" + logContent + "]";
	}
	
	
}
