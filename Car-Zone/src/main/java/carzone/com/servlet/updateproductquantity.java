package carzone.com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import carzone.com.conn.DBConnect;
import carzone.com.dao.DAO;
import carzone.com.entity.Product;

@WebServlet("/updateproductquantity")
public class updateproductquantity extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public updateproductquantity() {
        super();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DAO dao = new DAO(DBConnect.getConn());
            int carid = Integer.parseInt(request.getParameter("carid"));
            int carquantity = Integer.parseInt(request.getParameter("carquantity"));

            Product p = new Product();
            p.setCarid(carid);
            p.setCarquantity(carquantity);

            int result = dao.updateproductquantity(p); // Method name should be updated to `updateaproductquantity` to avoid confusion
            if (result > 0) {
                response.sendRedirect("updatec.jsp");
            } else {
                response.sendRedirect("failc.jsp");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("failc.jsp");
        }
    }
}
