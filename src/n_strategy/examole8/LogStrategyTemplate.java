package n_strategy.examole8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.DoubleToLongFunction;

public abstract class LogStrategyTemplate implements LogStrategy{

	@Override
	public final void log(String msg) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String date = format.format(new Date());
		msg = date + msg;
		
		doLog(msg);
		
	}

	protected abstract void doLog(String msg) ;
	
	

}
