package c_singleton.example1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
/**
 * 
 * @ClassName:  AppConfig   
 * @Description:读取文件配置
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午3:14:01
 */
public class AppConfig {
	static String paramA;
	static String paramB;
	
	public static void readConfig(String path) {
		Properties properties = new Properties();
		InputStream is = null;
		try {
			is= AppConfig.class.getResourceAsStream(path);
			properties.load(is);
			Set<String> names = properties.stringPropertyNames();
			/*这种更智能*/
			for (String name : names) {
				System.out.println(name+" = "+properties.getProperty(name));
			}
			
			/*这又是一种遍历*/
			Enumeration<?> names2 = properties.propertyNames();
			if (names2.hasMoreElements()) {
				String element = (String) names2.nextElement();
				System.out.println(element+" = " + properties.getProperty(element));
			}
			paramA = properties.getProperty("paramA");
			paramB = properties.getProperty("paramB");
			
		} catch (Exception e) {
			System.out.println("读取文件出错");
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
