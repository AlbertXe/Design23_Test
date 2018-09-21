package b_abstractfactory.example5;

public class Main {
	public static void main(String[] args) {
		DaoFactory factory = new XmlDaoFactory();
		OrderMainDao dao = (OrderMainDao) factory.getDao(1);
		OrderDatailDao dao2 = (OrderDatailDao) factory.getDao(2);
		dao.save();
		dao2.save();
	}
}
