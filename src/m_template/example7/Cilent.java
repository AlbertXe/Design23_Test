package m_template.example7;


public class Cilent {
	public static void main(String[] args) {
		LoginModel lm = new LoginModel();
		lm.setLoginId("admin");
		lm.setPwd("workerpwd");
		
		LoginTemplate template = new LoginTemplate();
		
		boolean flag = template.login(lm, new LoginCallback() {
			
			@Override
			public boolean match(LoginModel lm, LoginModel dblm, LoginTemplate template) {
				//自己不实现，调用模版
				return template.match(lm, dblm);
			}
			
			@Override
			public LoginModel findLoginUser(String loginId) {
				LoginModel loginModel = new LoginModel();
				loginModel.setLoginId(loginId);
				loginModel.setPwd("testPWD");
				return loginModel;
			}
			
			@Override
			public String encryptPwd(String pwd, LoginTemplate template) {
				return template.encryptPwd(pwd);
			}
		});
		System.out.println("可以进行普通人员登陆"+flag);
	}
}
