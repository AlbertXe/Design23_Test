package d_builder.example1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;

import javax.xml.crypto.Data;
/**
 * 
 * @ClassName:  ExportToXml   
 * @Description:导出成xml
 * @author: 谢洪伟 
 * @date:   2018年9月13日 上午9:33:42
 */
public class ExportToXml {
	
	public void export(ExportHeaderModel ehm,Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {
		
		//1.文件头
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version='1.0' encoding = 'utf-8' ?> \n");
		sb.append("<Report>\n");
		sb.append("    <Header>\n");
		sb.append("        <DepId>"+ehm.getDepId()+"</DepId>\n");
		sb.append("        <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n");
		sb.append("    </Header>\n");
		
		//2.文件主体
		sb.append("    <Body>\n");
		for (String table : mapData.keySet()) {
			sb.append("        <Datas tableName = \""+table+"\">\n");
			for (ExportDataModel data : mapData.get(table)) {
				sb.append("            <Data>\n");
				sb.append("                <ProductId>"+data.getProductId()+"</ProductId>\n");
				sb.append("                <Price>"+data.getPrice()+"</Price>\n");
				sb.append("                <Amount>"+data.getAmount()+"</Amount>\n");
				sb.append("            </Data>\n");
			}
			sb.append("        </Datas>\n");
		}
		sb.append("    </Body>\n");
		//文件尾部
		sb.append("    <Footer>\n");
		sb.append("        <ExportUser>"+efm.getExportUser()+"</ExportUser>\n");
		sb.append("    </Footer>\n");
		sb.append("</Report>\n");
		
		System.out.println("输出到XML文件的内容：\n"+sb);
		try {
			FileOutputStream fileOutputStream =new FileOutputStream(new File("data.xml"));
			fileOutputStream.write(sb.toString().getBytes());
			
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void toXmlFile(String path){
		
	}
}
