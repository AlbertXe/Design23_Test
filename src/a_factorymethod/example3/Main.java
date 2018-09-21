package a_factorymethod.example3;

public class Main {

	public static void main(String[] args) {
		Operate operate = new OpetateDB();
		operate.exprot("工作文件");
		Operate operate2 = new OpetateTXT();
		operate2.exprot("休闲");
		
	}
}
