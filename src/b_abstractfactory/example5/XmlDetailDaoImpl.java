package b_abstractfactory.example5;

public class XmlDetailDaoImpl implements OrderDatailDao{

	@Override
	public void save() {
		System.out.println("保存 订单 详情");
	}

}
