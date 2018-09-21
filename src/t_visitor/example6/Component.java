package t_visitor.example6;

public abstract class Component {
	public abstract void  accept(Visitor visitor) ;
	
	public void addChild(Component component){
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	public void removeChild(Component component){
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	public Component getChild(int index){
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
}
