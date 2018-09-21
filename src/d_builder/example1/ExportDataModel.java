package d_builder.example1;
/**
 * 
 * @ClassName:  ExportDataModel   
 * @Description:描述输出 数据对象
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午5:03:07
 */
public class ExportDataModel {
	/**
	 * 产品ID
	 */
	private String productId;
	
	/**
	 * 产品 价格
	 */
	private double price;
	
	/**
	 * 数量
	 */
	private double amount;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
