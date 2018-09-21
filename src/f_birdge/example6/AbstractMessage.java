package f_birdge.example6;
/**
 * 
 * @ClassName:  AbstractMessage   
 * @Description:抽象的消息对象   == 持有一个实现对线   == 实现与抽象的分离
 * @author: 谢洪伟 
 * @date:   2018年9月13日 下午3:21:40
 */
public class AbstractMessage {
	private Messageimplementor impl ;
	
	public AbstractMessage(Messageimplementor impl){
		this.impl = impl;
	}
	/**
	 * 转 调 实现的方法
	 * @param message
	 * @param toUser
	 */
	public void send(String message ,String toUser) {
		this.impl.send(message, toUser);
	}
}
