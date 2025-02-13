package carzone.com.servlet;

import java.io.IOException;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carzone.com.conn.DBConnect;
import carzone.com.dao.DAO;
import carzone.com.dao.DAO;




@MultipartConfig
@WebServlet("/addproduct")
public class addproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public addproduct() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try{
			DAO dao =new DAO(DBConnect.getConn());
			
			
		 	if(dao.addproduct(request) > 0)
			{
				
				response.sendRedirect("passc.jsp");
				
				
			}
			else
			{
		
				response.sendRedirect("failc.jsp");
			
			}
			
		}catch (Exception ex){
			System.out.println(ex);
		}

	
			
	
				
			
			
		
		
	}

	public void setDao(DAO daoMock) {
		// TODO Auto-generated method stub
		
	}

}
