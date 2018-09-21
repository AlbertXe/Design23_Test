package f_birdge.example6;

public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(Messageimplementor impl) {
		super(impl);
	}

	@Override
	public void send(String message, String toUser) {
		message += "紧急";
		super.send(message, toUser);
	}
	
	

}
