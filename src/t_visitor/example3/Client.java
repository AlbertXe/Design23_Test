package t_visitor.example3;

public class Client {
	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		
		Element a = new ElemetA();
		Element b = new ElemetB();
		os.addElement(a);
		os.addElement(b);
		
		Visitor visitor = new Visitor1();
		
		os.handleRequest(visitor);
		
	}
}
