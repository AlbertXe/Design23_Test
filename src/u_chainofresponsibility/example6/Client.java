package u_chainofresponsibility.example6;

public class Client {
	public static void main(String[] args) {
		GoodsSaleEbo saleEbo = new GoodsSaleEbo();
		SaleModel saleModel = new SaleModel();
		saleModel.setGoods("张学友经典");
		saleModel.setSaleNum(20);
		
		saleEbo.sale("小李", "张三", saleModel);
		saleEbo.sale("李四", "李四", saleModel);
		
	}
}
