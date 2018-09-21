package d_builder.example3;

import java.util.Collection;
import java.util.Map;

public class BuildTxt implements Builder {
	
	private StringBuffer buffer = new StringBuffer();
	@Override
	public void buildHeader(ExportHeaderModel ehm) {
		buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
	}

	@Override
	public void buildBody(Map<String, Collection<ExportDataModel>> dataMap) {
		for (String table : dataMap.keySet()) {
			buffer.append(table+"\n");
			for (ExportDataModel edm : dataMap.get(table)) {
				buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
			}
		}
	}

	@Override
	public void buildFooter(ExportFooterModel efm) {
		buffer.append(efm.getExportUser()+"\n");
	}
	
	@Override
	public String getResult() {
		return buffer.toString();
	}
}
