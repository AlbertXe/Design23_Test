package b_abstractfactory.example4;
/**
 * 
 * @ClassName:  Schema2   
 * @Description:装机方案二 ：AMD的cpu + 微星主板 939
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午1:49:46
 */
public class Schema2 implements AbstractFactory {

	@Override
	public Object create(int type) {
		
		if (type == 1) {
			return new CpuAMD(939);
		}else if (type ==2 ) {
			return new MainBordMSI(939);
		}
		return null;
	}

	

}
