package c_singleton.example4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		AppConfig instance = AppConfig.getInstance();
		Map map = instance.readConfig("AppConfig.properties");
		Set set = map.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String name =(String) iterator.next();
			System.out.println(name +" = "+ map.get(name));
		}
	}
}
