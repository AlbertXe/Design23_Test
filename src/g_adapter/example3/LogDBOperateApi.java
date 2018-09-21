package g_adapter.example3;

import java.util.List;

/**
 * 
 * @ClassName:  LogDBOperateApi   
 * @Description:新添加的功能 对日志的增删改查   也可以说是对客户借口 面对客户借口
 * @author: 谢洪伟 
 * @date:   2018年9月13日 下午4:27:04
 */
public interface LogDBOperateApi {
	
	public void create(LogModel log);
	
	public void remove(LogModel log) ;
	
	public void update(LogModel log) ;
	
	public List<LogModel>  getAll();
}
