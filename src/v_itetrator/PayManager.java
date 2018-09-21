package v_itetrator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PayManager extends Aggregate{
	private List<PayModel> list = new ArrayList<>();
	public List<PayModel> getPayList(){
		return list;
	}
 
	@Override
	public Iterator createItetator() {
		return list.iterator();
	}
	
	public void calcPay(){
		PayModel p1 = new PayModel();
		p1.setPay(3800);
		p1.setUserName("张三");
		PayModel p2 = new PayModel();
		p2.setPay(5800);
		p2.setUserName("李四");
		list.add(p1);
		list.add(p2);
	}
	
}
