package t_visitor.example6;

public interface Visitor {
	public void visitComposit(Composite composite);
	public void visitLeaf(Leaf leaf);
}
