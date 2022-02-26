package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/Third")
public class ThirdServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("ThirdServlet init 생성");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("ThirdServlet destroy 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ThirdServlet doget 메소드 호출");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ThirdServlet dopost 메소드 호출");
		
	}

}
