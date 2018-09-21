package m_template.example7;
/**
 * 登录控制的模板方法需要的回调接口，
 * 需要尽可能的把所有需要的接口方法都定义出来,
 * 或者说是所有可以被扩展的方法都需要被定义出来
 */
public interface LoginCallback {
	
	public LoginModel findLoginUser(String loginId);
	
	public String encryptPwd(String pwd,LoginTemplate template);
	
	public boolean match(LoginModel lm ,LoginModel dblm , LoginTemplate template);
}
