package a_factorymethod.example7;

public class ExportXMLFile implements ExportFileAPI {

	@Override
	public boolean export(String data) {
		System.out.println("导出XML 文件"+data);
		return true;
	}


}
