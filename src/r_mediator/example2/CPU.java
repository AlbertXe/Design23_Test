package r_mediator.example2;

public class CPU extends Colleague {

	public CPU(Mediator mediator) {
		super(mediator);
	}
	
	private String videoData;
	
	private String soundData;
	
	public String getVideoData(){
		return videoData;
	}
	
	public String getSoundData(){
		return soundData;
	}

	public void excuteData(String data){
		String[] datas = data.split(",");
		videoData = datas[0];
		soundData = datas[1];
		//通知主板 CPU工作完成
		this.getMediator().change(this);
	}
}
