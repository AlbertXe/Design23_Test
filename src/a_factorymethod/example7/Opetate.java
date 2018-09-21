package a_factorymethod.example7;

public class Opetate {

	protected ExportFileAPI factoryMethod(int type) {
		ExportFileAPI api = null;
		if (type == 1) {
		 api = new ExportDBFile();
		}else if (type == 2) {
			api =  new ExportTXTFile();
		}
		return api;
	}
	
	public boolean export(int type,String data) {
		ExportFileAPI exportFileAPI = factoryMethod(type);
		return exportFileAPI.export(data);
	}
}
