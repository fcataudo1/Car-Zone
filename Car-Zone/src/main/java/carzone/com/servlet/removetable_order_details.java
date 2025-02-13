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
import carzone.com.entity.order_details;





@MultipartConfig
@WebServlet("/removetable_order_details")
public class removetable_order_details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public removetable_order_details() {
        super();
     
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String id = request.getParameter("id");
		String ie = request.getParameter("ie");
		
		
	
			order_details c = new order_details();
			c.setDate(id);
			c.setCarimage(ie);
		
		
		
		
		
		try{
			
			
			DAO5 dao = new DAO5(DBConnect.getConn());
			
			
				if(dao.removeorder_details(c) > 0)
					response.sendRedirect("table_order_details.jsp");					
				else
					response.sendRedirect("table_order_details.jsp");					
			
			
				
			
			
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
