package a_factorymethod.example5;
/**
 * 
 * @ClassName:  Creator   
 * @Description:具体的组装由子类去实现
 * @author: 谢洪伟 
 * @date:   2018年9月12日 上午10:55:38
 */
public abstract class Creator {

	protected abstract Product_compo1 factory1() ;
	
	protected abstract Product_compo2 factory2() ;
	
	public Product creatProduct() {
		Product product =null;
		product.setProduct_compo1(factory1());
		product.setProduct_compo2(factory2());
		return product;
	}
}
