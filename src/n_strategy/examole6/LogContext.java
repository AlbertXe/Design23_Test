package n_strategy.examole6;

public class LogContext {
	private LogStrategy strategy ;
	public LogContext(LogStrategy strategy){
		this.strategy= strategy;
	}
	
	public void  log(String msg) {
		try {
			strategy.log(msg);
		} catch (Exception e) {
			e.printStackTrace();
			strategy = new FileLog();
			strategy.log(msg);
		}
	}
	
}
