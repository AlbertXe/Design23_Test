package d_builder.example1;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @ClassName:  ExportToTxt   
 * @Description:导出到文本文件
 * @author: 谢洪伟 
 * @date:   2018年9月12日 下午5:06:53
 */
public class ExportToTxt {
	
	public void export(ExportHeaderModel ehm,Map<String, Collection<ExportDataModel>> mapData,ExportFooterModel efm) {
		StringBuffer sb = new StringBuffer();
		//加载头部
		sb.append(ehm.getDepId()+",").append(ehm.getExportDate()).append("\n");
		//文件主体
		for (String table : mapData.keySet()) {
			sb.append(table+"\n");
			for (ExportDataModel edm : mapData.get(table)) {
				sb.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
			}
		}
		//文件末尾
		sb.append(efm.getExportUser()+"\n");
		System.out.println("输出文件内容：\n"+sb);
		
	}
}
