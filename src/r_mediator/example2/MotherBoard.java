package r_mediator.example2;
/**
 * 
 * @ClassName:  MotherBoard   
 * @Description:主板类  实现中介者
 * @author: 谢洪伟 
 * @date:   2018年9月18日 下午3:53:15
 */
public class MotherBoard implements Mediator {
	private CDDriver cdDriver = null;
	
	private CPU cpu = null;
	
	private SoundCard soundCard = null;
	
	private VideoCard videoCard = null;

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	
	@Override
	public void change(Colleague colleague) {
		if (colleague == cdDriver) {
			openCDDriverReadData((CDDriver)colleague);
		}else if (colleague == cpu) {
			openCPU((CPU)colleague);
		}
	}

	private void openCPU(CPU cpu) {
		String soundData = cpu.getSoundData();
		String videoData = cpu.getVideoData();
		this.videoCard.showData(videoData);
		this.soundCard.soundData(soundData);
	}

	private void openCDDriverReadData(CDDriver cd) {
		String data = cd.getData();
		
		this.cpu.excuteData(data);
	}

}
