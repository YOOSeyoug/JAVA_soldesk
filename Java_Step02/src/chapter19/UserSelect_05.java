package chapter19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelect_05 {

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
			String sql = "select userid, name, password, age, email from usertbl where userid=?";
			//4. PreparedStatement �� String -> sql
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "gabia2025");
			
			//5. ����
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				UserDTO userdto = new UserDTO();
				userdto.setUserid(rs.getString("userid"));
				userdto.setName(rs.getString("name"));
				userdto.setPassword(rs.getString("password"));
				userdto.setAge(rs.getInt("age"));
				userdto.setEmail(rs.getString("email"));
				
				System.out.println(userdto);
				
			}else {
				System.out.println("����� ���̵� �������� �ʽ��ϴ�.");
			}
			
			rs.close();
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
