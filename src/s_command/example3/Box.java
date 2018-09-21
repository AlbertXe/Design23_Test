package s_command.example3;

public class Box {
	private Command command;
	public Box(Command command){
		this.command = command;
	}
	
	public void openButtonPressed(){
		command.excute();
	}
	
	public void resetButtonPressed(){
		command.excute();
	}
	
}
