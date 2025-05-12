package chapter19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserAdd_02 {

	public static void main(String[] args) {
	
        Connection con = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. Connection �б�
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //�����ڵ�
			String user = "member"; //�����=�����ͺ��̽�
			String password = "12345"; //���
			
			con=DriverManager.getConnection(url, user, password);
			
			//3. usertbl �Է�
			String sql = "insert into usertbl(userid,name,password,age,email) ";
			sql += "values(?,?,?,?,?)";
			
			//4. PreparedStatement �� String -> sql
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "spring");
			pstmt.setString(2, "��");
			pstmt.setString(3, "12345");
			pstmt.setInt(4, 27);
			pstmt.setString(5, "spring@spring.com");
			
			//5. ����
			int rows = pstmt.executeUpdate(); //insert into �� ����
			System.out.println("�Էµ� ȸ�� ��: "+rows);
			
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
