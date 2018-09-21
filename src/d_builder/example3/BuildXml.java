package d_builder.example3;

import java.util.Collection;
import java.util.Map;

public class BuildXml implements Builder {
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void buildHeader(ExportHeaderModel ehm) {
		
	}

	@Override
	public void buildBody(Map<String, Collection<ExportDataModel>> dataMap) {

	}

	@Override
	public void buildFooter(ExportFooterModel efm) {

	}

	@Override
	public String getResult() {
		return null;
	}

}
