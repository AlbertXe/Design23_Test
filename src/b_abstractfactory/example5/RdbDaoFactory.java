package b_abstractfactory.example5;

public class RdbDaoFactory extends DaoFactory {

	@Override
	Object getDao(int type) {
		if (type == 1) {
			return new RdbMainDaoImpl();
		} else if (type == 2) {
			return new RdbDetailDaoImpl();
		} 
		return null;
	}

}
