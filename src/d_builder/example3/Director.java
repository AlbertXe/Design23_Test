package d_builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @ClassName:  Director   
 * @Description:指导者，指导 构建器 构建规则
 * @author: 谢洪伟 
 * @date:   2018年9月13日 上午10:29:28
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void construct(ExportHeaderModel ehm,Map<String, Collection<ExportDataModel>> dataMap,ExportFooterModel efm) {
		builder.buildHeader(ehm);
		builder.buildBody(dataMap);
		builder.buildFooter(efm);
	}
}
