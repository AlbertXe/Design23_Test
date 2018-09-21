package e_prototype.example7;
/**
 * 
 * @ClassName:  OrderPerson   
 * @Description:原型模式  == 克隆的使用教学
 * @author: 谢洪伟 
 * @date:   2018年9月13日 下午2:30:33
 */
public class OrderPerson implements Cloneable,OrderApi {
	private String cunstomerName;
	
	private Product product;
	
	private int orderProductNum;
	

	@Override
	public int getOrderProductNum() {
		return this.orderProductNum;
	}

	@Override
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}

	public String getCunstomerName() {
		return cunstomerName;
	}

	public void setCunstomerName(String cunstomerName) {
		this.cunstomerName = cunstomerName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	protected Object clone() {
		OrderPerson order =  null;
		try {
			order =(OrderPerson) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		order.setProduct((Product) order.getProduct().clone());
		return order;
	}

	@Override
	public String toString() {
		return "OrderPerson [cunstomerName=" + cunstomerName + ", product=" + product + ", orderProductNum=" + orderProductNum + "]";
	}
	
	
	
}
