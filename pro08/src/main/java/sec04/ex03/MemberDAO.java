package sec04.ex03;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {
	
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/servletex";
    private static final String user = "root";
    private static final String pwd = "1234";
	private Connection con;
	private Statement stmt;
	
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			connDB();
			String query = "select * from t_member";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date JoinDate = rs.getDate("JoinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(JoinDate);
				list.add(vo);
				
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
		
	}
    
    private void connDB() {
    	try {
    		Class.forName(driver);
    		System.out.println("mysql ����̹� �ε� ����");
    		con = DriverManager.getConnection(url, user, pwd);
    		System.out.println("Connection ���� ����");
    		stmt = con.createStatement();
    		System.out.println("Statement ���� ����");
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
	


}
