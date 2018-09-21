package r_mediator.example2;

public class CDDriver extends Colleague{

	public CDDriver(Mediator mediator) {
		super(mediator);
	}
	
	private String data;
	
	public String getData(){
		return this.data;
	}
	
	public void readCD(){
		data = "设计模式,好好研究";
		//通知主板 状态改变
		this.getMediator().change(this);
	}

}
