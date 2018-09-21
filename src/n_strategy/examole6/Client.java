package n_strategy.examole6;

public class Client {
	public static void main(String[] args) {
		LogContext log = new LogContext(new DbLog());
		log.log("我要保存照片");
	}
}
