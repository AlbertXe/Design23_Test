package u_chainofresponsibility.example6;

public class SaleModel {
	private String goods;
	
	private int saleNum;

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public int getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}

	@Override
	public String toString() {
		return "SaleModel [goods=" + goods + ", saleNum=" + saleNum + "]";
	}
	
	
}
