package f_birdge.example7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		String sql = "sql";
		// 1：装载驱动
		Class.forName("com.");
		// 2：创建连接
		Connection conn = DriverManager.getConnection("url", "user", "password");
		// 3：创建statement或者是preparedStatement
		PreparedStatement statement = conn.prepareStatement(sql);
		// 4：执行sql，如果是查询，再获取ResultSet
		ResultSet resultSet = statement.executeQuery(sql);
		// 5：循环从ResultSet中把值取出来，封装到数据对象中去
		while (resultSet.next()) {
			String uid = resultSet.getString("uid");
			int age = resultSet .getInt(2) ;//按 索引 取值
 		}
		//6：关闭
		resultSet.close();
		statement.close();
		conn.close();
	}
}
