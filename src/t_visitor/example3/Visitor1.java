package t_visitor.example3;

public class Visitor1 implements Visitor{

	@Override
	public void visitElementA(ElemetA elementA) {
		//1.执行功能
		
		elementA.operateA();
	}

	@Override
	public void visitElementB(ElemetB elementB) {
		
		elementB.operateB();
	}

}
