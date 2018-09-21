package d_builder.example3;

import java.util.*;

public class Client {
	public static void main(String[] args) {
		//准备测试数据
		ExportHeaderModel ehm = new ExportHeaderModel();
		ehm.setDepId("一分公司");
		ehm.setExportDate("2010-05-18");
		
		Map<String,Collection<ExportDataModel>> mapData = new HashMap<String,Collection<ExportDataModel>>();
		Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();
		
		ExportDataModel edm1 = new ExportDataModel();
		edm1.setProductId("产品001号");
		edm1.setPrice(100);
		edm1.setAmount(80);
		
		ExportDataModel edm2 = new ExportDataModel();
		edm2.setProductId("产品002号");
		edm2.setPrice(99);
		edm2.setAmount(55);		
		//把数据组装起来
		col.add(edm1);
		col.add(edm2);		
		mapData.put("销售记录表", col);
		
		ExportFooterModel efm = new ExportFooterModel();
		efm.setExportUser("张三");
		
		Builder builder = new BuildTxt();
		
		Director director = new Director(builder);
		director.construct(ehm, mapData, efm);
		System.out.println(builder.getResult());
		
		
		
	}
}