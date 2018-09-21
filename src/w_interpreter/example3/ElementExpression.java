package w_interpreter.example3;

import java.util.ArrayList;
import java.util.Collection;

import org.w3c.dom.Element;

public class ElementExpression extends ReadXmlExpression {
	private Collection<ReadXmlExpression> col = new ArrayList<>();
	
	private String eleName;
	public ElementExpression(String eleName){
		this.eleName = eleName;
	}
	
	public void addEle(ReadXmlExpression ele){
		col.add(ele);
	}
	
	public void removeEle(ReadXmlExpression ele){
		col.remove(ele);
	}

	@Override
	public String[] interpret(Context c) {
		Element preEle = c.getPreEle();
		if (preEle == null) {
			c.setPreEle(c.getDocument().getDocumentElement());
		}else {
			Element nowEle = c.getNowEle(preEle, eleName);
			c.setPreEle(nowEle);
		}
		
		//循环调用子元素的interpret方法
		String[] ss = null;
		for (ReadXmlExpression ele : col) {
			ss = ele.interpret(c);
		}
		
		return ss;
	}

}
