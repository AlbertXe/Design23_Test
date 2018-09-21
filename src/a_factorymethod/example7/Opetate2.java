package a_factorymethod.example7;
/**
 * 
 * @ClassName:  Opetate2   
 * @Description:新增功能=不用修改原来的，只要增加就可以了
 * @author: 谢洪伟 
 * @date:   2018年9月12日 上午10:41:42
 */
public class Opetate2 extends Opetate {

	@Override
	protected ExportFileAPI factoryMethod(int type) {
		ExportFileAPI api = null;
		if (type==3) {
			return api = new ExportXMLFile();
		} else {
			return super.factoryMethod(type);
		}
	}
	
	
}
