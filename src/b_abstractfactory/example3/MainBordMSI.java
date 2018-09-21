package b_abstractfactory.example3;

public class MainBordMSI implements API_MainBord {
	private int cpuHoles = 0;
	public MainBordMSI(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void install() {
		System.out.println("微星主板 cpu插槽个数="+cpuHoles);
		
	}

}
