package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest02
 */
@WebServlet("/sess2")
public class SessionTest02 extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}


	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.println("���Ǿ��̵�: " + session.getId() + "<br>");
		out.println("���� ���� �����ð�: " + new Date(session.getCreationTime()) + "<br>");
		out.println("���� ���� ���ٽð�: " + new Date(session.getLastAccessedTime()) + "<br>");
		out.println("�⺻ ���� ��ȿ�ð�: " + session.getMaxInactiveInterval() + "<br>");
		session.setMaxInactiveInterval(3);
		out.println("���� ��ȿ�ð�: " + session.getMaxInactiveInterval() + "<br>");
		if(session.isNew()) {
			out.print("���ο� ������ ����������ϴ�.");
		}
		
	}

}
