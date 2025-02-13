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
import carzone.com.entity.cart;
import carzone.com.entity.order_details;
import carzone.com.entity.orders;





@MultipartConfig
@WebServlet("/remove_orders")
public class remove_orders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public remove_orders() {
        super();
     
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
	

		String id = request.getParameter("id");
		
		orders od = new orders();
		od.setOrder_Id(Integer.parseInt(id));
		
		try{
			
			DAO2 dao = new DAO2(DBConnect.getConn());
			
			
			if(dao.removeorders(od) > 0)
			{
					response.sendRedirect("table_orders.jsp");
		
			}
			else
			{
				
					response.sendRedirect("table_orders.jsp");
			}
			
			
			
			}catch(Exception ex){
			   System.out.println(ex.getMessage());
			}
			
	
				
			
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
			
		
		
	}

	public void setDao(DAO2 daoMock) {
		// TODO Auto-generated method stub
		
	}

}
