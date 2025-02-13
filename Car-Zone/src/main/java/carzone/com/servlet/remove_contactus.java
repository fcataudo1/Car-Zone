package carzone.com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carzone.com.conn.DBConnect;

import carzone.com.dao.DAO2;
import carzone.com.dao.DAO5;
import carzone.com.entity.cart;
import carzone.com.entity.contactus;
import carzone.com.entity.order_details;
import carzone.com.entity.orders;





@MultipartConfig
@WebServlet("/remove_contactus")
public class remove_contactus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public remove_contactus() {
        super();
     
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
	

String Id = request.getParameter("id");
		
		
		
		contactus c = new contactus();
		
		c.setId(Integer.parseInt(Id));
		
		
		
		try{
			DAO5 dao = new DAO5(DBConnect.getConn());
			
			
			if (dao.removecont(c) > 0)
			{
				
					response.sendRedirect("table_contactus.jsp");
				
			}
			else
			{

				response.sendRedirect("table_contactus.jsp");
			}
			
			}catch(Exception ex){
			   System.out.println(ex.getMessage());
			}
		
	}
	
				
			
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
			
		
		
	}

	public void setDao(DAO5 daoMock) {
		// TODO Auto-generated method stub
		
	}

}
