package e_prototype.example3;

public class Client {
	
public static void main(String[] args) {
		OrderPerson order = new OrderPerson();
		order.setCustmoerName("张三");
		order.setOrderProductNum(3925);
		order.setProductId("12");
		Order_Biz order_Biz = new Order_Biz();
		order_Biz.save(order);
		
	}
}
