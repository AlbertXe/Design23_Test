package h_decorator.example3;

public class Main {
	public static void main(String[] args) {
		Decorator decoratora = new DecoratorA(new ComponentImpl());
		decoratora.operation();
		
	}
}
