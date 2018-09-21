package u_chainofresponsibility.example6;

public class Sale_SecurityCheck extends SaleHandler{

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		if ("李四".equals(user)) {
			return successor.sale(user, customer, saleModel);
		}else {
			System.out.println(user+"你没有权限");
			return false;
		}
		
	}

}
