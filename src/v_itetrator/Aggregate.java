package v_itetrator;

import java.util.Iterator;
/**
 * 
 * @ClassName:  Aggregate   
 * @Description:聚合对象的接口，定义创建相应迭代器对象的接口
 * @author: 谢洪伟 
 * @date:   2018年9月20日 上午9:47:44
 */
public abstract class Aggregate {
	public abstract Iterator createItetator();
}
