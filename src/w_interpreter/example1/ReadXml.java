package w_interpreter.example1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXml {
	public static void read(String filename) throws Throwable{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(filename);
		//去掉XML文档中作为格式化内容的空白而映射在DOM树中的不必要的Text Node对象
		doc.normalize();
		
		NodeList springDeafult = doc.getElementsByTagName("spring-default");
		NodeList applicationXmls = ((Element)springDeafult.item(0)).getElementsByTagName("application-xmls");
		NodeList applicationXml = ((Element)applicationXmls.item(0)).getElementsByTagName("application-xml");
		
		for (int i = 0; i < applicationXml.getLength(); i++) {
			String value = applicationXml.item(i).getFirstChild().getNodeValue();
			System.out.println("applicationxml"+value);
		}
		
		
	}
	public static void main(String[] args) {
		try {
			ReadXml.read("src/w_interpreter/example1/App2.xml");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
