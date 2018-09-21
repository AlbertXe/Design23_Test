package a_factorymethod.example5;
/**
 * 
 * @ClassName:  Product   
 * @Description:产品 ==部件 组装  这个好像是抽象工厂
 * @author: 谢洪伟 
 * @date:   2018年9月12日 上午10:47:54
 */
public interface Product {
	public void setProduct_compo1(Product_compo1 p1) ;
	public void setProduct_compo2(Product_compo2 p2) ;
}
