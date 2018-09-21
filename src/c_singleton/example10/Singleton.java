package c_singleton.example10;
/**
 * 
 * @ClassName:  Singleton   
 * @Description:volatile 修饰  双重判断 保证同步
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午4:40:54
 */
public class Singleton {
	
	private static volatile Singleton instance = null;
	private Singleton(){}
	
	public static Singleton  getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
