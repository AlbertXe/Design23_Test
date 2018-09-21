package c_singleton.example8;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: Singleton
 * @Description:缓存模拟实现单例
 * @author: 谢洪伟
 * @date: 2018年9月12日 下午4:16:41
 */
public class Singleton {

	private static Map<String, Singleton> map = new HashMap<>();

	private Singleton() {
	};

	private static Singleton instance = null;

	public static Singleton getInstance() {
		instance = map.get("1");
		if (instance == null) {
			instance = new Singleton();
			map.put("1", instance);
		}
		return instance;
	}
}
