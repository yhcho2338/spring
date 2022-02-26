package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest2
 */
@WebServlet("/test2")
public class LoginTest2 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디: " + user_id);
		System.out.println("비밀번호: " + user_pw);
		
		
		if(user_id != null && (user_id.length() != 0)) {
			//if(user_id.equals("admin") && user_pw.equals("0000")) {
		    if(user_id.equals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<font size='12'>관리자로 로그인 하셨습니다 </font>");
				out.print("<br>");
				out.print("<input type=button value='회원정보 수정'>");
				out.print("<input type=button value='회원정보 삭제'>");
				out.print("</html>");
				out.print("</body>");
			} else {
			out.print("<html>");
			out.print("<body>");
			out.print(user_id + "님 어서오세요.");
			out.print("</html>");
			out.print("</body>");
		    }
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("아이디와 비밀번호를 입혁하세요.");
			out.print("<br>");
			out.print("<a href='http://localhost:8080/pro06/test01/login.html'> 로그인 창으로 이동 </a>");
			out.print("</html>");
			out.print("</body>");
		}
		
		
	}

}
