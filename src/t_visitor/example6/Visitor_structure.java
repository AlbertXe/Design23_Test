package t_visitor.example6;

public class Visitor_structure implements Visitor {
	
	private String preStr = "    ";

	@Override
	public void visitComposit(Composite composite) {
		System.out.println(preStr+"+"+composite.getName());
		if (composite.getChildComponents()!=null) {
			preStr += "    ";
			for(Component child: composite.getChildComponents()){
				child.accept(this);//递归
			}
			//去掉多余空格
			preStr = preStr.substring(4);
		}
	}

	@Override
	public void visitLeaf(Leaf leaf) {
		System.out.println(preStr + "-" +leaf.getName());
	}

}
