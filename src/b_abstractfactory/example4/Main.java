package b_abstractfactory.example4;

public class Main {

	public static void main(String[] args) {
		ComputerEngine engine = new ComputerEngine();
		AbstractFactory factory = new Schema1();
		engine.makeComputer(factory);
		factory = new Schema3();
		engine.makeComputer(factory);
	}

}
