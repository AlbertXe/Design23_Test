package p_observer.example4;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {
	private String name;

	@Override
	public void update(Observable o, Object arg) {
		//推的方式
		System.out.println(name+"获得报纸"+arg);
		
		//拉的方式
		System.err.println(name+"获得报纸"+((NewsPaper)o).getContent());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
