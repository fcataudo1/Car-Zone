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
import carzone.com.entity.Product;







@WebServlet("/deleteProduct")
public class deleteProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public deleteProduct() {
        super();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
          
            int carid = Integer.parseInt(request.getParameter("carid"));
            
           
            DAO dao = new DAO(DBConnect.getConn());
            Product productToDelete = dao.getProductById(carid);
            
            if (productToDelete != null) {
                boolean success = dao.deleteProduct(productToDelete);
                if (success) {
                   
                    response.sendRedirect("removec.jsp");
                } else {
                   
                    response.sendRedirect("failc.jsp");
                }
            } else {
                // Prodotto non trovato
                response.sendRedirect("failc.jsp");
            }

        } catch (Exception ex) {
            System.out.println(ex);
            response.sendRedirect("failc.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

	public void setDao(DAO daoMock) {
		// TODO Auto-generated method stub
		
	}

}