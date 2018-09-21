package a_factorymethod.example3;
/**
 * 
 * @ClassName:  ExportTXTFile   
 * @Description:导出问TXT 文件
 * @author: 谢洪伟 
 * @date:   2018年9月12日 上午9:57:29
 */
public class ExportTXTFile implements ExportFileAPI {


	@Override
	public boolean export(String data) {
		System.out.println("导出成TXT文件");
		return true;
	}

}
