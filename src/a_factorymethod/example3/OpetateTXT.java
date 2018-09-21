package a_factorymethod.example3;

public class OpetateTXT extends Operate {

	public OpetateTXT() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ExportFileAPI factoryMethod() {
		return new ExportTXTFile();
	}

}
