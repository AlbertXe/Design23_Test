package f_birdge.example6;
/**
 * 
 * @ClassName:  MessageEmail   
 * @Description:两个维度：Implementor ：使用不同方式发消息 手机 邮箱 Abstraction :发什么消息：紧急 、加急
将他们组合在一块 而非继承一起
 * @author: 谢洪伟 
 * @date:   2018年9月13日 下午3:39:29
 */
public class MessageEmail implements Messageimplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("使用email 发送"+message+"到"+toUser);
	}

}
