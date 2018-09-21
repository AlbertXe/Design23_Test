package h_decorator.example3;

public class DecoratorA extends Decorator {

	public DecoratorA(Component component) {
		super(component);
	}

	public void operation() {
		System.out.println("执行A 操作");
		super.opetation();
		
	}
}
