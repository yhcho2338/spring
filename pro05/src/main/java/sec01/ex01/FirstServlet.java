package sec01.ex01;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼ҵ� ȣ��");
	}

	
	public void destroy() {
		System.out.println("destroy �޼ҵ� ȣ��");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����");
		
	}

}
