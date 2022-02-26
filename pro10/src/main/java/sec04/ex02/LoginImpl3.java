package sec04.ex02;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class LoginImpl3
 *
 */
@WebListener
public class LoginImpl3 implements HttpSessionListener {

	String user_id;
	String user_pw;
	static int total_user=0;
	
	public LoginImpl3() {
        // TODO Auto-generated constructor stub
    }
	public LoginImpl3(String user_id, String user_pw) {
        this.user_id = user_id;
        this.user_pw = user_pw;
    }


    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("技记 积己");
         ++total_user;
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	 System.out.println("技记 家戈");
         --total_user;
    }
	
}





