package r_mediator.example2;

public class Client {
	public static void main(String[] args) {
		MotherBoard mediator = new MotherBoard();
		CDDriver cdDriver = new CDDriver(mediator);
		CPU cpu = new CPU(mediator);
		SoundCard soundCard = new SoundCard(mediator);
		VideoCard videoCard = new VideoCard(mediator);
		
		mediator.setCdDriver(cdDriver);
		mediator.setCpu(cpu);
		mediator.setSoundCard(soundCard);
		mediator.setVideoCard(videoCard);
		
		cdDriver.readCD();
	}
}
