package e_prototype.example3;

public class OrderPerson implements OrderApi {
	private String productId;
	
	private String custmoerName;
	
	private int orderProductNum;
	

	@Override
	public int getOrderProductNum() {
		return this.orderProductNum;
	}

	@Override
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}
	
	

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCustmoerName() {
		return custmoerName;
	}

	public void setCustmoerName(String custmoerName) {
		this.custmoerName = custmoerName;
	}
	
	

	@Override
	public String toString() {
		return "个人订单： [productId=" + productId + ", custmoerName=" + custmoerName + ", orderProductNum=" + orderProductNum + "]";
	}

	@Override
	public OrderApi clone() {
		OrderPerson orderPerson = new OrderPerson();
		orderPerson.setCustmoerName(this.custmoerName);
		orderPerson.setOrderProductNum(this.orderProductNum);
		orderPerson.setProductId(this.productId);
		return orderPerson;
	}

}
