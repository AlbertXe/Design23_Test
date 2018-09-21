package l_proxy.example5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
	
	private OrderApi order = null;
	
	/**
	 * 传入真是对象
	 * @param order
	 * @return 绑定好代理和具体目标对象后的目标对象的接口
	 */
	public  OrderApi getProxyInterface(Order order){
		this.order = order;
		OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),order.getClass().getInterfaces(), this);
		
		return orderApi;
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().startsWith("set")) {
			if (order.getOrderUser()!=null && order.getOrderUser().equals(args[1])) {//创建者
				method.invoke(order, args);
			}else {
				System.out.println(args[1]+"你没有权限");
			}
		} else {
			method.invoke(order, args);
		}
		
		return null;
	}

}
