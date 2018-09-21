package i_composite.example3;

public abstract class Component {
	String name;
	
	public abstract void printStruct(String preStr);
	
	public void addChild(Component child) {
		throw new UnsupportedOperationException("对象支持这个功能");
	}
	
	public void removeChild(Component child){
		throw new UnsupportedOperationException("对象支持这个功能");
	}
	
	public void getChild(int index){
		throw new UnsupportedOperationException("对象支持这个功能");
	}
}
