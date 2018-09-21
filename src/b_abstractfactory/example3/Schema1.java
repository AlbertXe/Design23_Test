package b_abstractfactory.example3;
/**
 * 
 * @ClassName:  Schema1   
 * @Description:IntelCPU + 技嘉主板
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午1:46:59
 */
public class Schema1 implements AbstractFactory {


	@Override
	public API_Cpu createAPI_Cpu() {
		return new CpuIntel(1156);
	}

	@Override
	public API_MainBord createAPI_MainBoard() {
		return new MainBordGA(1156);
	}

}
