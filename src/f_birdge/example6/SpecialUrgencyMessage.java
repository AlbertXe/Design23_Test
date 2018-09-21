package f_birdge.example6;

public class SpecialUrgencyMessage extends AbstractMessage{

	public SpecialUrgencyMessage(Messageimplementor impl) {
		super(impl);
	}

	@Override
	public void send(String message, String toUser) {
		message += "特别紧急";
		super.send(message, toUser);
	}
	
	

}
