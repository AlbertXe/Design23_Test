package m_template.example7;
/**
 * 
 * @ClassName:  LoginTemplate   
 * @Description:
 * 			a)解决问题：业务逻辑在不同对象中有不同细节实现，但逻辑的框架（算法）是相同的
			b)采用继承的方式，将逻辑框架（算法）放在抽象基类，并定义好细节 接口，在子类中实现
			c)Strategy也可以解决这个问题。
			d)实际就是多态的方式 实现细节可高层接口的松耦合。 封装通用算法，子类实现细节（多态）
			e)管理员、普通用户登陆问题 Comparator
 * @author: 谢洪伟 
 * @date:   2018年9月17日 下午2:39:49
 */
public class LoginTemplate {
	
	public final boolean login(LoginModel lm,LoginCallback loginCallback){
		LoginModel user = loginCallback.findLoginUser(lm.getLoginId());
		if (user != null ) {
			String pwd = loginCallback.encryptPwd(user.getPwd(),this );
			lm.setPwd(pwd);
			return loginCallback.match(lm, user, this);
		}
		return false;
	}
	
	public String  encryptPwd(String pwd) {
		return pwd;
	}
	
	public boolean match (LoginModel lm, LoginModel dblm  ){
		if (lm.getLoginId().equals(dblm.getLoginId())&&lm.getPwd().equals(dblm.getPwd())) {
			return true;
		}
		return false;
	}
	

}
