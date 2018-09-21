package l_proxy.example5;

public class Order implements OrderApi {
	/**
	 * 订单者
	 */
	private String orderUser;
	
	/**
	 * 产品名称
	 */
	private String productName;
	
	/**
	 * 订单数量
	 */
	private String orderNum;
	

	public Order(String productName, String orderNum, String orderUser) {
		this.orderUser = orderUser;
		this.productName = productName;
		this.orderNum = orderNum;
	}

	public String getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(String orderUser,String user) {
		this.orderUser = orderUser;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName,String user) {
		this.productName = productName;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum,String user) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "Order [orderUser=" + orderUser + ", productName=" + productName + ", orderNum=" + orderNum + "]";
	}
	
	
}
