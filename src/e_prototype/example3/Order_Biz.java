package e_prototype.example3;

import java.util.ArrayList;
import java.util.List;

public class Order_Biz {
	
	public void save(OrderApi order) {
		List<OrderApi> list = new ArrayList<>();
		
		
		//根据业务要求，当订单的预定的产品数量超过1000的时候，就需要把订单拆成两份订单
		while (order.getOrderProductNum()>1000) {
			OrderApi new_order = order.clone();
			new_order.setOrderProductNum(1000);
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			list.add(new_order);
		}
		list.add(order);
		for (OrderApi orderApi : list) {
			System.out.println(orderApi.toString());
		}
		
	}
}
