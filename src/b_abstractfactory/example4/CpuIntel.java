package b_abstractfactory.example4;

public class CpuIntel implements API_Cpu {
	
	private int pins = 0;
	public CpuIntel(int pins) {
		this.pins = pins;
	}

	@Override
	public void calculate() {
		System.out.println("now in Intel CPU,pins="+pins);	
	}

}
