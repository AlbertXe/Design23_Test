package l_proxy.example5;

public interface OrderApi {
	
	public String getOrderUser();
	
	public void setOrderUser(String orderUser,String user) ;

	public String getProductName() ;

	public void setProductName(String productName,String user) ;

	public String getOrderNum() ;

	public void setOrderNum(String orderNum,String user) ;
}
