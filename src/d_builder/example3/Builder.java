package d_builder.example3;

import java.util.Collection;
import java.util.Map;

public interface Builder {
	
	public void buildHeader(ExportHeaderModel ehm);
	public void buildBody(Map<String, Collection<ExportDataModel>> dataMap);
	public void buildFooter(ExportFooterModel efm);
	public String getResult() ;
}
