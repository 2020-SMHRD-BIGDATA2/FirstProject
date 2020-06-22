package 자바프로젝트;

import java.io.File;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class xslx {
	public static void main(String[] args) {
		// oracle - String url = "jdbc:oracle:thin:@127.0.0.1:1521:ora10";
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		String url = "jdbc:odbc:bookdata";
//		String user = "hr";
//		String passwd = "hr";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			String sql = "select * from [data$]";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString(6);
				String writer = rs.getString(7);
				String publisher = rs.getString(8);
				System.out.println(name + "\t" + writer + "\t" + publisher);
			}
		} catch (Exception e) {
			System.err.println("Exception:" + e.getMessage());

		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}

		}
	}
}
