package w_interpreter.example3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 
 *	上下文，用来包含解释器需要的一些全局信息
 * @ClassName:  Context   
 * @Description:
 * @author: 谢洪伟 
 * @date:   2018年9月21日 下午2:58:35
 */

public class Context {
	
	private Element preEle;
	
	private Document document;
	
	public Context(String path){
		this.document = XmlUtil.getRoot(path);
	}
	/**
	 * 重新初始化
	 */
	public void reInit(){
		preEle = null;
	}
	
	public Element getNowEle(Element pEle,String eleName){
		NodeList nodes = pEle.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			if (nodes.item(i) instanceof Element) {
				Element ele = (Element)nodes.item(i);
				if (ele.getNodeName().equals(eleName)) {
					return ele;
				}
			}
		}
		return null;
	}
	public Element getPreEle() {
		return preEle;
	}
	public void setPreEle(Element preEle) {
		this.preEle = preEle;
	}
	public Document getDocument() {
		return document;
	}
	
	
}
