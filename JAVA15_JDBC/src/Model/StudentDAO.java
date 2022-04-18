package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO(Data Acceess Object) : �����ͺ��̽� ���� �۾��� �����ϴ� Ŭ����
//�����ͺ��̽� ����, (�Է�, ����, ����, ��ȸ) - CRUD ���� �۾��� �ϴ� Ŭ����
//CRUD(Create(�Է�) Read(��ȸ) Updated(����) Delete(����))
public class StudentDAO {

	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	// DB ���� �޼ҵ�
	public void connect() {
		try {
			// ClassNotFoundException �߻��� �� ����
			// 1. ������Ʈ ojdbc ���̺귯���� �߰��Ͽ����� Ȯ��
			// 2. ��Ÿ Ȯ��
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// 2. ����� ���� ����, db ���� ��ü(Connection) ����
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ����� ��ü�� ��ȯ
	public void close() {
		try {
			if (rs != null) {
				rs.close(); // selectStds(), selectOneStd()������ ����ϴ� ��ü
							// ResultSet ��ü�� �����Ǿ������� ȣ�� ������ �޼���
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// ���1. ����ڰ� �Է��� ���� STUDENT ���̺� ����(�л��߰�)
	public boolean insertStd(String name, int age, String tel, String email) {
		// JAVA -Oracle DB : JDBC java api

//		Connection conn = null; // ��üŸ��, ���۷���Ÿ�Ե��� null������ �ʱ�ȭ ����
//		PreparedStatement pst = null;
		boolean check = false;

		try {// ������ �ڵ�
				// 1. Oracle JDBC driver �����ε�(�����Ҷ� ������ ���ڴ�!)
				// try~catch : ����ó���� �� �� ���

			// ����1. ������ ���� : �ڵ���ü�� Ʋ�� (��Ÿ, �����̸�, ��������)
			// ����2. ��Ÿ�� ���� : �ڵ� Ʋ������ �ƴ�, ���������� ������ ���� ���
			// -> ��Ÿ�ӿ����� ���������� ������ �߻����� �� �� ����-> ���� ó���� �������

			// ClassNotFoundException �߻��� �� ����
			// 1. ������Ʈ ojdbc ���̺귯���� �߰��Ͽ����� Ȯ��
			// 2. ��Ÿ Ȯ��
			connect();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "hr";
//			String password = "hr";
			// 2. ����� ���� ����, db ���� ��ü(Connection) ����
//			conn = DriverManager.getConnection(url, user, password);

			// 3. ������ sql��(String) ����
			// ? : ���ε庯��
			// java�� �����ϴ� sql���� ��� auto commit : ��� sql�� �ڿ��� ; ������ �ȵ�!
			String sql = "insert into student values(stdseq.nextval, ?, ?, ?, ?)";

			// 4. sql���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. ���ε� ���� ä���
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, tel);
			pst.setString(4, email);

			// 6. sql�������Ͽ� ��� ó��
			// executeUpdate() : insert, delete, update -> table�� ��ȭ�� �Ͼ
			// ��ȯ�� : int( -> table�󿡼� ��� ���� ������ �Ǿ������� ��ȯ
			// / ������ ����� �Ͼ ��쿡�� �׻� 0���� ū ���� ��ȯ
			// executeQuery() : select -> (table �� ��ȭ�� �Ͼ�� ����)
			// ��ȯŸ�� : ResultSet ��ü
			int cnt = pst.executeUpdate(); // ��� ���� �����Ǿ����� Ȯ��

			if (cnt > 0) { // �߰� ����
				check = true;
			} else { // �߰� ����
				check = false;
			}

			// catch:try������ ���ܻ�Ȳ�� �߻��� ��� catch������ �����Ե�
		} catch (Exception e) {// ClassNotFoundException�� ó������
			// Exception e -> ��� ���ܻ�Ȳ�� ó�� ����
			// �߻��� ���ܻ�Ȳ�� �߻� ������� ���(��� ���ܻ�Ȳ�� �߻��߰�
			// ���������� �߻��ߴ��� �ܼ�â���� ����Ȯ��)
			e.printStackTrace(); // �����߿� ���
			System.out.println("������ �غ����Դϴ�."); // �����߿� ���
			// finally : try������ ���ܻ�Ȳ�� �߻��ϴ���/�߻����� �ʴ��� �������� ������ ����
			// �ɼ�(�ᵵ�ǰ� �Ƚᵵ��)
		} finally {
			// ���� ��ü��(Connection, PreparedStatement) ������(��ȯ)
			// ���� �� �����߿� : ������ ���� �ݴ��
			close();
//			try {
//				// try�ȿ��� pst ��ü�� ������ �ȵǾ��� ���� ���� -> ���� �޼ҵ�� ȣ���ϱ� ������ ��Ÿ�� ����
//				pst.close();
//				conn.close();
//			} catch (SQLException e) {
//
//				e.printStackTrace();
//			}

		}

		return check;
	}

	public ArrayList<StudentVO> selectStds() {

//		Connection conn = null;
//		PreparedStatement pst = null;
//		ResultSet rs = null;

		ArrayList<StudentVO> al = new ArrayList<StudentVO>();

		try {
			connect();
			// 1.jdbc ����̹� �����ε�
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "hr";
//			String password = "hr";

			// 2.�����ͺ��̽� ���ᰴü(Connection)����
//			conn = DriverManager.getConnection(url, user, password);

			// 3. ������ sql��(String) ����
			String sql = "select * from student"; // ��� ������

			// 4. sql ���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. sql�� �����ϰ� ���
			rs = pst.executeQuery();

			// STUDENT ���̺� ���� �о ���(�� �л��� ���� ���)
			while (rs.next()) { // rs.next() ��ü�� T/F Ȯ��
				int num = rs.getInt(1); // ���� Ŀ���� ����Ű�� �ִ� ���� ù��° �÷����� �о���ڴ�!
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");

				// ������ �о�� ������ �ʱ�ȭ���� ������ StudentVO ��ü�� ��������
				// ArrayList�� �߰�
				al.add(new StudentVO(num, name, age, phone, email));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			// ��ü�� ������(Connection, PreparedStatment, ResultSet)������
//			try {
//				rs.close();
//				pst.close();
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}

		}

		return al;

	}

	public StudentVO selectOnestd(int num) {
		// selectStd ���� : Arraylist�� ���� �ʿ� ����!
		// sql�� ����(������ �ʿ� ! �л���ȣ(������Է�)�� �˻�), insert ����
		// ��ȯŸ��, �Ű����� ����!

//		Connection conn = null;
//		PreparedStatement pst = null;
//		ResultSet rs = null;
		StudentVO vo = null;

		try { // 1.jdbc ����̹� �����ε�
			connect();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "hr";
//			String password = "hr";

			// 2.�����ͺ��̽� ���ᰴü(Connection)����
//			conn = DriverManager.getConnection(url, user, password);

			// 3. ������ sql��(String) ����
			String sql = "select * from student where num = ?"; // ��� ������

			// 4. sql ���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 4-1. ���ε庯�� ä���
			pst.setInt(1, num);

			// 5. sql�� �����ϰ� ���
			rs = pst.executeQuery();

			// STUDENT ���̺� ���� �о ���(�� �л��� ���� ���)
			// sql�� ����� wherer ���������� Ư���� ��ȣ�� ���� �л��� �˻�
			// ->resultsest �� �ش� ��ȣ�� table�� �����ϸ� �ִ� 1�� ���� �����͸� ����
			// �������� ������ ������ x
			if (rs.next()) { // rs.next() ��ü�� T/F Ȯ��
				int get_num = rs.getInt(1); // ���� Ŀ���� ����Ű�� �ִ� ���� ù��° �÷����� �о���ڴ�!
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");

				vo = new StudentVO(num, name, age, phone, email);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			// ��ü�� ������(Connection, PreparedStatment, ResultSet)������
//			try {
//				rs.close();
//				pst.close();
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}

		}

		return vo;

	}

	public boolean updatePhone(int num, String phone) {

		// �ּҰ��� ������ �� �ִ� ���� => �� ������
//		Connection conn = null;
//		PreparedStatement pst = null;
		boolean check = false;

		try {
			connect();
			// 1. jdbc ����̹� �����ε�
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "hr";
//			String password = "hr";

			// 2. �����ͺ��̽� ���ᰴü(Connection) ����
//			conn = DriverManager.getConnection(url, user, password);

			// 3. ������ sql�� ����
			String sql = "update student set phone = ? where num = ?";

			// 4. sql���� �غ�ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. ���ε� ���� ä���
			pst.setString(1, phone);
			pst.setInt(2, num);

			// 6. sql�� ����, ��� ó��
			int cnt = pst.executeUpdate();

			if (cnt > 0) { // ������ �� ��쿡�� check�� ture������ ����
				check = true;
			} else {
				check = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
//			try {
//				pst.close();
//				conn.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}

		}
		return check;

	}

	public boolean updatemail(int num, String email) {

//		Connection conn = null;
//		PreparedStatement pst = null;
		boolean check = false;

		try {
			connect();
			// 1. jdbc ����̹� �����ε�
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "hr";
//			String password = "hr";

			// 2. �����ͺ��̽� ���ᰴü(Connection) ����
//			conn = DriverManager.getConnection(url, user, password);

			// 3. ������ sql�� ����
			String sql = "update student set email = ? where num = ?";

			// 4. sql���� �غ�ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. ���ε� ���� ä���
			pst.setString(1, email);
			pst.setInt(2, num);

			// 6. sql�� ����, ��� ó��
			int cnt = pst.executeUpdate();

			if (cnt > 0) { // ������ �� ��쿡�� check�� ture������ ����
				check = true;
			} else {
				check = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
//			try {
//				pst.close();
//				conn.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}

		}
		return check;

	}

	public boolean deleteStd(int num) {

//		Connection conn = null;
//		PreparedStatement pst = null;

		boolean check = false;

		try {
			connect();
			// 1. jdbc ����̹� �����ε�
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "hr";
//			String password = "hr";

			// 2. �����ͺ��̽� ���ᰴü(Connection) ����
//			conn = DriverManager.getConnection(url, user, password);

			// 3. ������ sql�� ����
			String sql = "delete from student where num = ?";

			// 4. sql���� �غ�ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. ���ε� ���� ä���
			pst.setInt(1, num);

			// 6. sql�� ����, ��� ó��
			int cnt = pst.executeUpdate();

			if (cnt > 0) { // ����� ���� �Ǿ��� ��
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
//			try {
//				pst.close();
//				conn.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}

		}
		return check;

	}
}
