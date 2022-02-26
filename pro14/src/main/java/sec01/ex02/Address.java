package sec01.ex02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Address {
	private String city;
	private String zipcode;
	
	public Address() {
		
	}
	
	public Address (String city, String zipcode) {
		this.city = city;
		this.zipcode = zipcode;
		
	}
	
    public String getCity() {
    	return city;
    }
    
    public void setCity(String city) {
    	this.city = city;
    }
    
    public String getZipcode() {
    	return zipcode;
    }
    
    public void setZipcode(String zipcode) {
    	this.zipcode = zipcode;
    }
	
	
	

}
