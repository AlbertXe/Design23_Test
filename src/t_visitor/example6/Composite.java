package t_visitor.example6;

import java.util.ArrayList;
import java.util.Collection;

public class Composite extends Component{
	
	private Collection<Component> childComponents ;

	@Override
	public void accept(Visitor visitor) {
		visitor.visitComposit(this);
	}
	
	private String name;
	
	public Composite(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void addChild(Component child){
		if (childComponents == null) {
			childComponents = new ArrayList<>();
		}
		childComponents.add(child);
	}
	
	public Collection<Component> getChildComponents(){
		return childComponents;
	}

}
