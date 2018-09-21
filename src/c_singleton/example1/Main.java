package c_singleton.example1;

public class Main {
	public static void main(String[] args) {
		AppConfig.readConfig("AppConfig.properties");
		String paramA = AppConfig.paramA;
		String paramB = AppConfig.paramB;
		System.out.println("paramA = "+paramA);
		System.out.println("paramB = "+paramB);
	}
}
