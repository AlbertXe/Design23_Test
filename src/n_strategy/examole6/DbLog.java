package n_strategy.examole6;import f_birdge.example6.Messageimplementor;

public class DbLog implements LogStrategy {

	@Override
	public void log(String msg) {
		if (msg!=null&&msg.length()>5) {
			int a = 5/0;
			System.out.println("现在把 '"+msg+"' 记录到数据库中");
		}
		
	}

}
