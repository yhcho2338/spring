package sec02.ex01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class MemberDAO {
     private Connection con;
     private PreparedStatement pstmt;
	 private DataSource dataFactory;
	 
	 public MemberDAO() {
	  try {
		Context ctx = new InitialContext();
		Context envContext = (Context) ctx.lookup("java:/comp/env");
		dataFactory = (DataSource) envContext.lookup("jdbc/servletex");
		} 
	  catch (Exception e) {
		e.printStackTrace();
		}
    }

public List listMembers(MemberVO memberVO) {
    List membersList = new ArrayList();
    String names=memberVO.getName();
     try {
      con = dataFactory.getConnection();
      String query = "select * from t_member ";
       if((names!=null && names.length()!=0)){
         query+=" where name=?";
         pstmt = con.prepareStatement(query);
         pstmt.setString(1, names);
        }else {
	     pstmt = con.prepareStatement(query);
	}



		System.out.println("prepareStatement: " + query);
		ResultSet rs = pstmt.executeQuery();
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
			membersList.add(vo);
			
		}
		rs.close();
		pstmt.close();
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return membersList;
	
	
}

/*
private void connDB() {
	try {
		Class.forName(driver);
		System.out.println("mysql 드라이버 로딩 성공");
		con = DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection 생성 성공");
		pstmt = con.createStatement();
		System.out.println("Statement 생성 성공");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}*/

}