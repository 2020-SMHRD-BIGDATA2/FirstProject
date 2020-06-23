package ������;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class bookDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String bookid;

	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert(bookVO vo) {

		int cnt = 0;

		try {

			getConnection();

			String sql = "INSERT INTO BOOKS VALUES(?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			// id�ߺ� �Ұ��� ��� �߰�
			psmt.setString(1, vo.getBookid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getAuthor());
			psmt.setString(4, vo.getPublisher()+"null");
			psmt.setString(5, "1");
			psmt.setInt(6, vo.getYear());
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// url, id, pw �� �ϳ��� Ʋ�� ���ɼ��� �ֱ� ������ �ۼ�
			e.printStackTrace();
		} finally {
			// ���⼭ �ݾ��ָ�� (4��)
			close();
		}
		return cnt;
	}

//	public String login(bookVO vo) {
//		String name = null;
//
//		try {
//			getConnection();
//
//			String sql = "SELECT * FROM BOOKS WHERE bookid = ?";
//
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, vo.getBookid());
//			rs = psmt.executeQuery(); // �����͸� �����ͼ� Ȯ���� �� ��
//			// �α��� ���� ���� �ϴ� �κ�
//			if (rs.next()) { // �α��� ������ ������ ��
//				name = rs.getString("name");// �α��� ���н� null �� ��
//
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return name;
//	}
	public ArrayList<bookVO> selectAll() {

		ArrayList<bookVO> list = new ArrayList<bookVO>();

		getConnection();

		try {
			String sql = "SELECT * FROM BOOKS";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				bookid = rs.getString(1);
				System.out.println(bookid);
				bookVO vo = new bookVO(bookid);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}

}
