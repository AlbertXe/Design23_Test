package h_decorator.example3;

public class DecoratorB extends Decorator {

	public DecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.opetation();
		System.out.println("执行B操作");
		
	}

}
