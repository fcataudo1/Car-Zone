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

@WebServlet("/updateproductbrandid")
public class updateproductbrandid extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public updateproductbrandid() {
        super();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DAO dao = new DAO(DBConnect.getConn());
            int carid = Integer.parseInt(request.getParameter("carid"));
            int bid = Integer.parseInt(request.getParameter("bid"));

            Product p = new Product();
            p.setCarid(carid);
            p.setBid(bid);

            int result = dao.updateaproductbrandid(p);
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