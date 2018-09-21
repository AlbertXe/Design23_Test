package i_composite.example1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @ClassName:  Composite   
 * @Description:	组合对象，通常需要存储子对象，定义有子部件的部件行为，
 * @author: 谢洪伟 
 * @date:   2018年9月14日 上午10:20:20
 */
public class Composite {
	
	//本节点
	private String name;
	
	public Composite(String name){
		this.name = name ;
	}
	
	 private Collection<Composite> childComposite = new ArrayList<>();
	 
	 private Collection<Leaf> childLeaf = new ArrayList<>();
	 
	 public void addComposite(Composite composite) {
		childComposite.add(composite);
	}
	 
	 public void addLeaf(Leaf leaf) {
		 childLeaf.add(leaf);
	}
	 
	 public void printStruct(String preStr) {
		 //先把自己输出
		System.out.println(preStr+"+"+this.name);
		//输出空格表示 输出自己的子代
		preStr += "    ";
		for (Leaf leaf : childLeaf) {
			leaf.printStruct(preStr);
		}
		for (Composite composite : childComposite) {
			//递归输出每个子对象
			composite.printStruct(preStr);
		}
	}
}
