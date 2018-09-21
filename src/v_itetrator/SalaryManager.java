package v_itetrator;

import java.util.Iterator;

public class SalaryManager  extends Aggregate{

	@Override
	public Iterator createItetator() {
		return new ArrayIteratorImpl(this);
	}
	
	private  PayModel[] pms ;
	public PayModel[] getPays(){
		return pms;
	}
	
	public void calcSalary(){
		PayModel p = new PayModel();
		p.setPay(2000);
		p.setUserName("王五");
		
		PayModel p2 = new PayModel();
		p2.setPay(3000);
		p2.setUserName("赵六");
		
		pms = new PayModel[2];
		pms[0] = p;
		pms[1] = p2;
		
	}
	
	public Object get(int index){
		if (index<pms.length) {
			return pms[index];
		}
		return null;
	}
	
	public int size(){
		return pms.length;
	}
	
}
