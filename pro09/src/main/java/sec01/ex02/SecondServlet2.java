package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet2
 */
@WebServlet("/secondHref2")
public class SecondServlet2 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		
		out.print("<html><body>");
		if(user_id !=null && user_id.length() != 0) {
			out.println("�̹� �α��� �����Դϴ�!<br><br>");
			out.println("ù��° �������� �ѱ� ���̵�: " + user_id + "<br>");
			out.println("ù��° �������� �ѱ� ��й�ȣ: " + user_pw + "<br>");
			out.println("ù��° �������� �ѱ� �ּ�: " + user_address + "<br>");
			out.print("</body></html>");
		}else {
			out.print("�α��� ���� �ʾҽ��ϴ�!<br><br>");
			out.print("�ٽ� �α��� �ϼ���!<br>");
			out.print("<a href='/pro09/login.html'>�α���â���� �̵�</a>");
		}
		
		
		
	}

}
