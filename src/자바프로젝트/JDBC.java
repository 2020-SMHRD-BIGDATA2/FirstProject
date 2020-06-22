package �ڹ�������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("�������");
			}

			String sql = "select * from bookinfo";
			pst = conn.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1);
				String title = rs.getString(2);
				String price = rs.getString(3);
				String author = rs.getString(4);
				String publisher = rs.getString(5);
				System.out.println("�ڵ� : " + code + "\r" + "���� : " + title + "\r" + "���� : " + price + "\r" + "���� : "
						+ author + "\r" + "���ǻ� : " + publisher + "\r" + "=================");

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				pst.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
	

}
