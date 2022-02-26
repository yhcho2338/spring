package sec04.ex01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class LoginImpl implements HttpSessionBindingListener {

    String user_id;
    String user_pw;
    static int total_user=0;
    
    public LoginImpl() {
        
    }
    
    public LoginImpl(String user_id, String user_pw) {
        this.user_id = user_id;
        this.user_pw = user_pw;
    }

    @Override
	public void valueBound(HttpSessionBindingEvent arg0) {
    	System.out.println("����� ����");
    	++total_user;
    }
    
    @Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
    	System.out.println("����� ���� ����");
    	total_user--;
    }
}
