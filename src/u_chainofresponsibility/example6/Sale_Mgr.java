package u_chainofresponsibility.example6;
/**
 * 
 * @ClassName:  Sale_Mgr   
 * @Description:真正处理销售的业务功能的职责对象
 * @author: 谢洪伟 
 * @date:   2018年9月19日 下午4:29:47
 */
public class Sale_Mgr extends SaleHandler{

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		System.out.println(user+customer+saleModel);
		return true;
	}

}
