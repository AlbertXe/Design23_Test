package b_abstractfactory.example4;
/**
 * 
 * @ClassName:  Schema1   
 * @Description:IntelCPU + 技嘉主板 1156
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午1:46:59
 */
public class Schema1 implements AbstractFactory {

	@Override
	public Object create(int type) {
		if (type == 1) {
			return new CpuIntel(1156);
		}else if (type == 2) {
			return new MainBordGA(1156);
		} 
		
		return null;
	}



}
