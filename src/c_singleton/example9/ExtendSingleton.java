package c_singleton.example9;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @ClassName:  ExtendSingleton   
 * @Description:单例扩展 三个
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午4:26:51
 */
public class ExtendSingleton {
	private ExtendSingleton(){}
	private static String DEFAULT = "cache";
	static Map<String,ExtendSingleton> map = new HashMap<>();
	
	private static ExtendSingleton instance = null;
	
	private static int num = 1;
	private final static int MAX = 3;
	
	public static ExtendSingleton getInstance() {
		instance = map.get(DEFAULT+num);
		if (instance == null) {
			instance = new ExtendSingleton();
			map.put(DEFAULT+num, instance);
		} 
		num++;
		if (num>MAX) {
			num = 1;
		}
		return instance;
	}
	
	public static void main(String[] args) {
		ExtendSingleton t1 = getInstance();
		ExtendSingleton t2 = getInstance();
		ExtendSingleton t3 = getInstance();
		ExtendSingleton t4 = getInstance();
		ExtendSingleton t5 = getInstance();
		ExtendSingleton t6 = getInstance();
		
		System.out.println("t1=="+t1);
		System.out.println("t2=="+t2);
		System.out.println("t3=="+t3);
		System.out.println("t4=="+t4);
		System.out.println("t5=="+t5);
		System.out.println("t6=="+t6);
	}
	
}
