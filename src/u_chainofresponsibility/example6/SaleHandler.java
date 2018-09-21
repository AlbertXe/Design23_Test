package u_chainofresponsibility.example6;
/**
 * 
 * @ClassName:  SaleHandler   
 * @Description:a)将可能处理请求的对象 形成一个链，将请求在链上传递，知道有对象处理。
				b)当一个请求传递来事，h1看自己有没有后继对象，有就传递，没有自己处理
				c)降低系统耦合
 * @author: 谢洪伟 
 * @date:   2018年9月19日 下午4:10:05
 */
public abstract class SaleHandler {
	protected SaleHandler successor ;
	
	public void setSuccessor(SaleHandler successor){
		this.successor = successor;
	}
	
	public abstract boolean sale(String user,String customer,SaleModel saleModel);
}
