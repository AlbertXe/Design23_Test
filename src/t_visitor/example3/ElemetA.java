package t_visitor.example3;

public class ElemetA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitElementA(this);
	}
	
	public void operateA(){
		
	}
	
}
