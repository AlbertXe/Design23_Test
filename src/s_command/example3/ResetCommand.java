package s_command.example3;

public class ResetCommand implements Command {
	private MainBoardApi api =null;
	
	public ResetCommand(MainBoardApi api){
		this.api = api;
	}

	@Override
	public void excute() {
		api.reset();
	}
}
