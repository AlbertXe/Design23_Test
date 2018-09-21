package g_adapter.example3;

import java.util.List;

/**
 * 
 * @ClassName:  Adapter   
 * @Description:适配器对象，把记录日志到文件的功能适配成第二版需要的增删改查的功能
 * @author: 谢洪伟 
 * @date:   2018年9月13日 下午4:29:31
 */
public class Adapter implements LogDBOperateApi {
	
	private LogFileOperateApi adaptee ;
	
	public  Adapter(LogFileOperateApi adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void create(LogModel log) {
		List<LogModel> logs = adaptee.read(); //1. 读取日志文件
		logs.add(log);	//2. 增加日志
		adaptee.write(logs);	//3. 写入日志文件
		
	}

	@Override
	public void remove(LogModel log) {
		List<LogModel> logs = adaptee.read();
		logs.remove(log);
		adaptee.write(logs);
	}

	@Override
	public void update(LogModel log) {
		List<LogModel> logs = adaptee.read();
		for (int i = 0; i < logs.size(); i++) {
			if (logs.get(i).getLogId().equals(log.getLogId())) {
				logs.set(i, log);
			}
		}
	}

	@Override
	public List<LogModel> getAll() {
		return adaptee.read();
	}

}
