package b_abstractfactory.example5;

public class XmlDaoFactory extends DaoFactory {

	@Override
	Object getDao(int type) {
		if (type == 1) {
			return new XmlMainDaoImpl();
		} else if (type == 2) {
			return new XmlDetailDaoImpl();
		} 
		return null;
	}

}
