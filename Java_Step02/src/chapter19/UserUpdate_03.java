package chapter19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdate_03 {

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
			String sql = "update usertbl set email=? where userid=?";
			
			//4. PreparedStatement �� String -> sql
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "561@naver.com");
			pstmt.setString(2, "smile2025");
			
			//5. ����
			int rows = pstmt.executeUpdate(); //insert into �� ����
			System.out.println("������ ȸ�� ��: "+rows);
			
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
