package c_singleton.example2;
/**
 * 
 * @ClassName:  Singleton   
 * @Description:饥汉 模式
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午3:37:17
 */
public class Singleton {
	private static Singleton instance = null;
	private Singleton(){};
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			return new Singleton();
		}
		return instance;
	}
	
	
}
