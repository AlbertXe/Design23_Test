package t_visitor.example3;
/**
 * 
 * @ClassName:  Visitor   
 * @Description:20.Visitor	对象行为型
				a)解决问题：需求变更，不停打补丁，编译整个系统代码。
				将变更封装到一个类中，并将待更改类提供一个接口。
				Visitor模式关键是：双分派。有两个多态 。
 * @author: 谢洪伟 
 * @date:   2018年9月19日 上午10:54:12
 */
public interface Visitor {
	public void visitElementA(ElemetA elementA);
	public void visitElementB(ElemetB elementB);
}
