package h_decorator.example3;
/**
 * 
 * @ClassName:  Decorator   
 * @Description:装饰器接口，维持一个指向组件对象的接口对象，
 * 				并定义一个与组件接口一致的接口
 * @author: 谢洪伟 
 * @date:   2018年9月14日 上午9:31:41
 */
public abstract class Decorator extends Component {
	
	private Component component;
	
	 public  Decorator(Component component){
		 this.component = component;
	 };
	 
	 public void opetation(){
		 System.out.println("Decorator");
		 //转发请求，在此之前可以做自己的操作
		 component.operation();
	 }
}
