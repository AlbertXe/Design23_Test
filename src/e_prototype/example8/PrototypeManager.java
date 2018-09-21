package e_prototype.example8;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName:  PrototypeManager   
 * @Description:原型管理器
 * @author: 谢洪伟 
 * @date:   2018年9月13日 下午2:46:55
 */
public class PrototypeManager {
	
	//用来记录原型的编号和原型实例的对应关系   类似缓存
	
	private static Map<String, Prototype> map = new HashMap();
	
	private PrototypeManager(){};
	
	public static synchronized Prototype getPrototype(String prototypeId) {
		Prototype prototype = map.get(prototypeId);
		if (prototype == null) {
			try {
				throw new Exception("原型不存在");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return prototype ;
	}
	
	public static synchronized void setPrototype(String prototypeId,Prototype prototype) {
		map.put(prototypeId, prototype);
	}
	
	public static synchronized void removePrototype(String prototypeId) {
		map.remove(prototypeId);
	}
}
