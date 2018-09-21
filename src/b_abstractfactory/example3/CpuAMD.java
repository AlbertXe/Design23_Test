package b_abstractfactory.example3;

public class CpuAMD implements API_Cpu{
	private int pins = 0;
	

	public CpuAMD(int pins) {
		this.pins = pins;
	}


	@Override
	public void calculate() {
		System.out.println("CpuAmp 计算"+"针脚="+pins);
	}


}
