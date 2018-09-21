package j_flyweight.example3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityMgr {
	private SecurityMgr(){}
	
	private static SecurityMgr securityMgr = new SecurityMgr();
	
	public static SecurityMgr getInstance() {
		return securityMgr;
	}
	
	/**
	 * 在运行期间，用来存放登录人员对应的权限，
	 * 在Web应用中，这些数据通常会存放到session中
	 */
	private static Map<String, Collection<Flyweight>> map = new HashMap<>();
	
	/**
	 * 模拟登陆 
	 * @param user
	 */
	public void login(String user){
		Collection<Flyweight> col = queryByUser(user);
		map.put(user, col);
	}
	
	/**
	 * 查询用户的  所有权限
	 * @param user
	 * @return
	 */
	private Collection<Flyweight> queryByUser(String user) {
		Collection<Flyweight> list = new ArrayList<>();
		Collection<String> colDB = TestDB.colDB;
		for (String dbuser : colDB) {
			String[] dbs = dbuser.split(",");
			if (user.equals(dbs[0])) {
				Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight(dbs[1]+","+dbs[2]);
				list.add(flyweight);
			}
		}
		
		return list;
	}
	
	public boolean hasPermit(String user,String securityEntity,String permit){
		Collection<Flyweight> col = map.get(user);
		if (col == null) {
			System.out.println("该用户未登陆或没有权限");
			return false;
		}
		for (Flyweight flyweight : col) {
			System.out.println(flyweight);
			if (flyweight.match(securityEntity, permit)) {
				return true;
			}
		}
		return false;
	}
	
	
}
