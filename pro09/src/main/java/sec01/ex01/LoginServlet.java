package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
/*@WebServlet("/login")*/
public class LoginServlet extends HttpServlet {


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		String user_enter = request.getParameter("user_enter");
		String user_enter2 = request.getParameter("user_enter2");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		String user_email = request.getParameter("user_email");
		String user_hp = request.getParameter("user_hp");
		
		String data = "<html><body>";
		data += user_enter;
		data += "<br>";
		data += user_enter2;
		data += "<br><br>";
		data += "아이디: " + user_id;
		data += "<br>";
		data += "비밀번호: " + user_pw;
		data += "<br>";
		data += "주소: " + user_address;
		data += "<br>";
		data += "이메일: " + user_email;
		data += "<br>";
		data += "휴대전화: " + user_hp;
		data += "</html></body>";
		out.print(data);
	}

}
