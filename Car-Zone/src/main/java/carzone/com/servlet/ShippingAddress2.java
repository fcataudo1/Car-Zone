package carzone.com.servlet;

import java.io.IOException;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carzone.com.conn.DBConnect;
import carzone.com.dao.DAO;
import carzone.com.dao.DAO2;
import carzone.com.entity.cart;
import carzone.com.entity.customer;
import carzone.com.dao.DAO;




@MultipartConfig
@WebServlet("/ShippingAddress2")
public class ShippingAddress2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ShippingAddress2() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		String CName = request.getParameter("CName");
		String City = request.getParameter("City");
		String Total = request.getParameter("Total"); 
		String CusName = request.getParameter("CusName");
		 

		String cash = request.getParameter("cash");

		String online = request.getParameter("online");


		 
		 if(request.getParameter("cash") != null)
		 {
			 response.sendRedirect("confirmpayment.jsp?CName= "+CName+" &City="+City+" &Total="+Total+" &CusName="+CusName+"");
			// response.sendRedirect("orders.jsp?Name= "+Name+" &City="+City+" &Total="+Total+"");
		 }
		 
		 if(request.getParameter("online") != null)
		 {
			 response.sendRedirect("confirmonline.jsp?CName= "+CName+" &City="+City+" &Total="+Total+" &CusName="+CusName+"");
			// response.sendRedirect("orders.jsp?CName= "+CName+"  &City="+City+" &Total="+Total+"");
		 }
		 
		 
		 
		 
		 
			
		
		
	}

}
