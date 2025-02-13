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





@MultipartConfig
@WebServlet("/removecart")
public class removecart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public removecart() {
        super();
     
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String id = request.getParameter("id");
		String ie = request.getParameter("ie");

		
		cart d = new cart();
		d.setName(id);
		d.setCarimage(ie);
		
		
		
		
		
		try{
			
			DAO2 dao = new DAO2(DBConnect.getConn());
			
			
			if(dao.removecart(d) > 0)
			{
					response.sendRedirect("cart.jsp");
		
			}
			else
			{
				
					response.sendRedirect("cart.jsp");
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
