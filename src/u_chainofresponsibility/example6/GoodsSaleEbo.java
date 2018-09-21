package u_chainofresponsibility.example6;

public class GoodsSaleEbo {
	public boolean sale (String user,String customer,SaleModel saleModel){
		//1：权限检查
		//2：通用数据检查（这个也可能在表现层已经作过了）
		//3：数据逻辑校验
		//4：真正的业务处理
		Sale_SecurityCheck ssc = new Sale_SecurityCheck();
		Sale_DataCheck sdc = new Sale_DataCheck();
		Sale_logicCheck slc = new Sale_logicCheck();
		Sale_Mgr sm = new Sale_Mgr();
		
		ssc.setSuccessor(sdc);
		sdc.setSuccessor(slc);
		slc.setSuccessor(sm);
		
		
		return ssc.sale(user, customer, saleModel);
	}
}
