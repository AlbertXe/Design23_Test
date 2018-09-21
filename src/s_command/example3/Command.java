package s_command.example3;
/**
 * 
 * @ClassName:  Command   
 * @Description:
 * a)将请求封装到Command，实现调用操作的对象和操作的具体对象（接口 多态）解耦。
	b)Command: receiver;执行他的命令
	Receiver：具体的业务
	Invoke：调用 含有Command
 * @author: 谢洪伟 
 * @date:   2018年9月19日 上午10:05:19
 */
public interface Command {
	public void excute();
}
