package chapter19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_01 {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. Connection �б�
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //�����ڵ�
			String user = "system"; //�����=�����ͺ��̽�
			String password = "1234"; //���
			
			con=DriverManager.getConnection(url, user, password);
			System.out.println("�����ͺ��̽� ���� ����");
			
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
