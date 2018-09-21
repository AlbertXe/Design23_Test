package t_visitor.example3;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {
	/**
	 * 对象结构 
	 */
	private Collection<Element> col = new ArrayList<Element>();
	
	public void handleRequest(Visitor visitor){
		for (Element element : col) {
			element.accept(visitor);
		}
	}
	
	public void addElement(Element element){
		col.add(element);
	}
}	
