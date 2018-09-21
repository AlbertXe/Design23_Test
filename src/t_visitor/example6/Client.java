package t_visitor.example6;

public class Client {
	public static void main(String[] args) {
		Component root = new Composite("服装");
		Component c1 = new Composite("男装");
		Component c2 = new Composite("女装");
		
		Component d1 = new Leaf("衬衣");
		Component d2 = new Leaf("夹克");
		Component d3 = new Leaf("裙子");
		Component d4 = new Leaf("套装");
		
		root.addChild(c1);
		root.addChild(c2);
		
		c1.addChild(d1);
		c1.addChild(d2);
		
		c2.addChild(d3);
		c2.addChild(d4);
		
		Visitor visitor = new Visitor_structure();
		root.accept(visitor);
		
	}
}
