package g_adapter.example3;

import java.util.List;

public interface LogFileOperateApi {
	public List<LogModel> read() ;
	
	public void write(List<LogModel> logs) ;

}
