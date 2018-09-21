package t_visitor.example3;

public class ElemetB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitElementB(this);
	}
	
	public void operateB(){
		
	}
}
