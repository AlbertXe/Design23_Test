package m_template.example7;

public class LoginModel {
	private String loginId;
	
	private String pwd;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "LoginModel [loginId=" + loginId + ", pwd=" + pwd + "]";
	}
	
	
}
