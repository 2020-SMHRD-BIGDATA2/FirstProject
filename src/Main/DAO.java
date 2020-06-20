package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

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

	public int join(VO vo) {

		int cnt = 0;

		try {

			getConnection();

			String sql = "INSERT INTO info VALUES(?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			// id�ߺ� �Ұ��� ��� �߰�
//			for (int i = 0; i < args.length; i++) {
//				
//			}

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
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

	public String login(VO vo) {
		String name = null;

		try {
			getConnection();

			String sql = "SELECT * FROM info WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			rs = psmt.executeQuery(); // �����͸� �����ͼ� Ȯ���� �� ��
			// �α��� ���� ���� �ϴ� �κ�
			if (rs.next()) { // �α��� ������ ������ ��
				name = rs.getString("name");// �α��� ���н� null �� ��

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return name;
	}

	public ArrayList<VO> selectAll() {

		ArrayList<VO> list = new ArrayList<VO>();

		getConnection();

		try {
			String sql = "SELECT * FROM info";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				VO vo = new VO(id, name, age);
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
