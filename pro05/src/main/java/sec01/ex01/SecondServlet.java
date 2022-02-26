package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/Second")
public class SecondServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("secondServlet init 持失");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("secondServlet destroy 持失");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("secondServlet doGet 持失");
	}

}
