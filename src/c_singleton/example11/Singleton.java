package c_singleton.example11;
/**
 * 
 * @ClassName:  Singleton   
 * @Description:静态内部类 实现单例 实现延迟加载
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午4:47:21
 */
public class Singleton {
	
	private Singleton (){};
	
	/**
	 * 
	 * @ClassName:  SingletonHolder   
	 * @Description:静态成员内部类
	 * @author: 谢洪伟 
	 * @date:   2018年9月12日 下午4:51:08
	 */
	private static class SingletonHolder{
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
