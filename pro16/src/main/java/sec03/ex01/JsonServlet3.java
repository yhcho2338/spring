package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class JsonServlet3
 */
@WebServlet("/json3")
public class JsonServlet3 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}


	public void destroy() {
		// TODO Auto-generated method stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter writer = response.getWriter();
    	
    	JSONObject totaObject = new JSONObject();
    	JSONArray membersArray = new JSONArray();
    	JSONObject memberInfo = new JSONObject();
    	memberInfo.put("name", "류현진");
    	memberInfo.put("age", "33");
    	memberInfo.put("gender", "남자");
    	memberInfo.put("nickname", "류뚱");
    	membersArray.add(memberInfo);
    	
    	memberInfo = new JSONObject();
    	memberInfo.put("name", "김연아");
    	memberInfo.put("age", "32");
    	memberInfo.put("gender", "여자");
    	memberInfo.put("nickname", "여왕");
    	membersArray.add(memberInfo);
    	
    	totaObject.put("members", membersArray);
    	JSONArray bookArray = new JSONArray();
    	JSONObject bookInfo = new JSONObject();
    	
    	bookInfo.put("title", "나는 슈뢰딩거의 고양이로소이다");
    	bookInfo.put("writer", "원종우" );
    	bookInfo.put("price", "30000");
    	bookInfo.put("genre", "science");
    	bookInfo.put("image", "http://localhost:8080/pro16/image/I'mCat.jpg");
    	bookArray.add(bookInfo);
    	
    	bookInfo = new JSONObject();
    	bookInfo.put("title", "우주의 끝을 찾아서");
    	bookInfo.put("writer", "이강환" );
    	bookInfo.put("price", "12000");
    	bookInfo.put("genre", "science");
    	bookInfo.put("image", "http://localhost:8080/pro16/image/end_Space.jpg");
    	bookArray.add(bookInfo);
    	
    	totaObject.put("books", bookArray);
    	String jsonInfo = totaObject.toJSONString();
    	System.out.print(jsonInfo);
    	writer.print(jsonInfo);
    	
    }

}
