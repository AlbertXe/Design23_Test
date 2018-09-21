package f_birdge.example6;

public class MessageSMS implements Messageimplementor{

	@Override
	public void send(String message, String toUser) {
		System.out.println("使用SMS 发送"+message+toUser);
	}

}
