package v_itetrator;

import java.util.Iterator;

public class ArrayIteratorImpl implements Iterator {
	
	private SalaryManager salaryManager;
	
	private int index = 0;
	public ArrayIteratorImpl(SalaryManager salaryManager){
		this.salaryManager = salaryManager;
	}

	@Override
	public boolean hasNext() {
		if (salaryManager!=null&&index<salaryManager.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Object obj = null;
		if (hasNext()) {
			obj = salaryManager.get(index);
			index ++;
		}
		return obj;
	}

}
