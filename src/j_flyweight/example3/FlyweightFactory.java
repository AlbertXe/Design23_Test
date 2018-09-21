package j_flyweight.example3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static FlyweightFactory factory = new FlyweightFactory();
	private FlyweightFactory(){}
	
	public static FlyweightFactory getInstance(){
		return factory;
	}
	
	/**
	 * 缓存多个 Flyweight
	 */
	public  Map<String, Flyweight> map = new HashMap<>();
	
	public  Flyweight getFlyweight(String key) {
		Flyweight flyweight = map.get(key);
		if (flyweight == null) {
			flyweight = new Flyweight_Authorization(key.split(",")[0], key.split(",")[1]);
		}
		return flyweight;
	}
}
