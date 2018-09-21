package f_birdge.example6;

public class MessageMobile implements Messageimplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("使用手机发送"+message+toUser);
	}

}
