package u_chainofresponsibility.example6;

public class Sale_logicCheck extends SaleHandler{

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		return successor.sale(user, customer, saleModel);
	}

}
