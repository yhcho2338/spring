package sec02.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Date;

public class MemberVO {
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date JoinDate;
	
	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Date getJoinDate() {
		return JoinDate;
	}
	
	public void setJoinDate(Date JoinDate) {
		this.JoinDate = JoinDate;
	}
	


}

