package b_abstractfactory.example3;

public class MainBordGA implements API_MainBord {
	private int cpuHoles = 0;
	public MainBordGA(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void install() {
		System.out.println("技嘉主板 cpu插槽个数="+cpuHoles);
	}

}
