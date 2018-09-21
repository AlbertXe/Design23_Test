package s_command.example3;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import a_factorymethod.example3.Main;

public class Client  {
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		MainBoardApi api = new GigaMainBoard();
		
		Command command = new ResetCommand(api);
		
		Box box = new Box(command);
		box.resetButtonPressed();
		
	}
}
	
	

