package b_abstractfactory.example4;

public class Schema3 implements AbstractFactory{

	@Override
	public Object create(int type) {
		if (type == 1) {
			return new CpuAMD(1156);
		} else if (type == 2) {
			return new MainBordGA(1156);
		}else if (type == 3) {
			return new MemaryHy();
		}
		return null;
	}

}
