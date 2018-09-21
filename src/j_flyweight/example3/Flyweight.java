package j_flyweight.example3;
/**
 * 
 * @ClassName:  Flyweight   
 * @Description:轻量级 享元模式
 * @author: 谢洪伟 
 * @date:   2018年9月14日 下午1:50:42
 */
public interface Flyweight {
	/**
	 * 判断传入的实体 和权限 是否和享元 对象内部状态匹配
	 * @param securityEntity
	 * @param permit
	 * @return
	 */
	public boolean match(String securityEntity, String permit);
}
