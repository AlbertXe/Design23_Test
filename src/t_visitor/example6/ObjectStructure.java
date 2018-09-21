package t_visitor.example6;

public class ObjectStructure {
	private Component root;
	
	public void  setRoot(Component root){
		this.root = root;
	}
	
	public void handleRequest(Visitor visitor){
		root.accept(visitor);
	}
}
