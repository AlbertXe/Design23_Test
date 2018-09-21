package i_composite.example3;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> childs = null;
	
	public Composite(String name) {
		super.name = name;
	}
	
	@Override
	public void addChild(Component child) {
		if (childs == null) {
			childs = new ArrayList<>();
		}
		childs.add(child);
	}

	@Override
	public void removeChild(Component child) {
		childs.remove(child);
	}

	@Override
	public void getChild(int index) {
		for (int i = 0; i < childs.size(); i++) {
			childs.get(index);
		}
	}

	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr+"+"+super.name);
		preStr += "    ";
		
		if (childs !=null) {
			for (Component component : childs) {
				component.printStruct(preStr);
			}
		}
		
	}

}
