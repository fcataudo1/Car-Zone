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





@MultipartConfig
@WebServlet("/removetable_cart")
public class removetable_cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public removetable_cart() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String id = request.getParameter("id");
		String ie = request.getParameter("ie");
		
		
	
			cart c = new cart();
			c.setName(id);
			c.setCarimage(ie);
		
		
		
		
		
		try{
			
			
			DAO2 dao = new DAO2(DBConnect.getConn());
			
			if(id.equals("null"))
			{
				if(dao.removecartnull(c) > 0)
					response.sendRedirect("table_cart.jsp");					
				else
					response.sendRedirect("table_cart.jsp");					
			}
			else
			{
				if(dao.removecart(c) > 0)
					response.sendRedirect("table_cart.jsp");
				else
					response.sendRedirect("table_cart.jsp");					
			}
				
			
			
			}catch(Exception ex){
			   System.out.println(ex.getMessage());
			}
			
	
				
			
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
			
		
		
	}

}
