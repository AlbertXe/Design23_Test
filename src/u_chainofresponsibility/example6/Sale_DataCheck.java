package u_chainofresponsibility.example6;

public class Sale_DataCheck extends SaleHandler {

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		
		if (user==null || user.trim().length()==0 ) {
			System.out.println("申请人不能为空");
			return false;
		}
		if (customer == null || customer.trim().length() == 0) {
			System.out.println("客户不能为空");
			return false ;
		}
		
		if (saleModel == null || saleModel.getGoods() ==null || saleModel.getSaleNum() == 0) {
			System.out.println("销售商品的数据不能为空");
		}
		
		//如果通过了上面的检测，那就向下继续执行
		return successor.sale(user, customer, saleModel);
	}

}
