package b_abstractfactory.example3;
/**
 * 
 * @ClassName:  Schema2   
 * @Description:装机方案二 ：AMD的cpu + 微星主板
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午1:49:46
 */
public class Schema2 implements AbstractFactory {

	@Override
	public API_Cpu createAPI_Cpu() {
		return new CpuAMD(939);
	}

	@Override
	public API_MainBord createAPI_MainBoard() {
		return new MainBordMSI(939);
	}

}
