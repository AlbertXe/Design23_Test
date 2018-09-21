package c_singleton.example12;
/**
 * 
 * @ClassName:  Singleton   
 * @Description:枚举 实现 单例
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午4:53:03
 */
public enum Singleton {
	/**
	 * 定义一个枚举元素，他就代表一个单例
	 */
	instacne;
	
	/**
	 * 可以有自己的操作
	 */
	public void oprate() {
		System.out.println("自己的操作");
	}
	
	public static void main(String[] args) {
		Singleton singleton = Singleton.instacne;
		singleton.oprate();
		
	}
}
