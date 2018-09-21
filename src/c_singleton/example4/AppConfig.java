package c_singleton.example4;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class AppConfig {
	private static AppConfig instance = new AppConfig();
	private AppConfig(){};
	
	public static AppConfig getInstance() {
		return instance;
	}
	
	public Map readConfig(String path){
		Properties properties = new Properties();
		InputStream is = null;
		Map map = new HashMap<>();
		try {
			is = AppConfig.class.getResourceAsStream(path);
			properties.load(is);
			Set<String> names = properties.stringPropertyNames();
			for (String name : names) {
				map.put(name, properties.get(name));
			}
		} catch (IOException e) {
			System.out.println("读取文件出错");
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return map;
		
	}
	
	
}
