package t_visitor.example6;

public class Visitor_name implements Visitor {

	@Override
	public void visitComposit(Composite composite) {
		System.out.println("节点："+composite.getName());
	}

	@Override
	public void visitLeaf(Leaf leaf) {
		System.out.println("叶子："+leaf.getName());
	}

}
