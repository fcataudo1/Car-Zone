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
import javax.servlet.http.HttpSession;

import carzone.com.conn.DBConnect;
import carzone.com.dao.DAO;
import carzone.com.dao.DAO2;
import carzone.com.dao.DAO3;
import carzone.com.entity.cart;
import carzone.com.entity.customer;
import carzone.com.entity.usermaster;
import carzone.com.dao.DAO;




@MultipartConfig
@WebServlet("/addtocart")
public class addtocart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public addtocart() {
        super();
     
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String N = request.getParameter("N");

		// out.println(N);
		String id=request.getParameter("id");
		String ie=request.getParameter("ie");
		String ig=request.getParameter("ig");
		String ihstr=request.getParameter("ih");
		int ih = Integer.parseInt(ihstr);
		String iistr =request.getParameter("ii");
		int ii = Integer.parseInt(iistr);
		String ij=request.getParameter("ij");

		
		cart c = new cart();
		c.setName(N);
		c.setBname(id);
		c.setCname(ie);
		c.setCarname(ig);
		c.setCarprice(ih);
		c.setCarimage(ij);
		c.setCarquantity(ii);
		
		
		
		
		try{
			DAO3 dao = new DAO3(DBConnect.getConn());
			
			
			if (dao.checkaddtocartnull(c) ==true)
			{
				if(dao.updateaddtocartnull(c) > 0)
				{
					Cookie cart = new Cookie("cart","cartt");
					cart.setMaxAge(10);
					response.addCookie(cart);
					response.sendRedirect("cart.jsp");
					
				}
				else
					response.sendRedirect("selecteditemc.jsp");
			}
			else
			{
				if(dao.addtocartnull(c)>0)
				{
					Cookie cart = new Cookie("cart","cartt");
					cart.setMaxAge(10);
					response.addCookie(cart);
					response.sendRedirect("cart.jsp");
				}
				else
					response.sendRedirect("selecteditemc.jsp");
			}
			
			}catch(Exception ex){
			   System.out.println(ex.getMessage());
			}
			
	
				
			
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
			
		
		
	}

	

	public void setDao(DAO3 daoMock) {
		// TODO Auto-generated method stub
		
	}

}