package carzone.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carzone.com.conn.DBConnect;
import carzone.com.dao.DAO;
import carzone.com.entity.customer;



@WebServlet("/deletecustomer")
public class deletecustomer extends HttpServlet{
	

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String Name = req.getParameter("Name");
		String Email_Id =  req.getParameter("Email_Id");
		
		
		
		customer c = new customer();
		
		c.setName(Name);
		c.setEmail_Id(Email_Id);
		
		DAO dao = new DAO(DBConnect.getConn());
		
		boolean f = dao.deleteCustomer(c);
		
		
		if(f)
		{
	
			resp.sendRedirect("managecustomers.jsp");
			
		
		}
		else {
			
			
			resp.sendRedirect("managecustomers.jsp");
		
		
		}	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}

	public void setDao(DAO daoMock) {
		// TODO Auto-generated method stub
		
	}
	
}
