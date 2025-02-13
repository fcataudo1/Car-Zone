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

@WebServlet("/updateproductcategoryid")
public class updateproductcategoryid extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public updateproductcategoryid() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DAO dao = new DAO(DBConnect.getConn());
            int pid = Integer.parseInt(request.getParameter("carid"));
            int cid = Integer.parseInt(request.getParameter("cid"));

            Product p = new Product();
            p.setCarid(pid);
            p.setCid(cid);

            int result = dao.updateaproductcategoryid(p);
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
