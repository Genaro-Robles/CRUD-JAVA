
package Controlador;

import Modelo.Cuotas;
import ModeloDAO.CuotasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CASA
 */
@WebServlet(name = "Controlador_Cuo", urlPatterns = {"/Controlador_Cuo"})
public class Controlador_Cuo extends HttpServlet {
    
    String listar="vistas/listar_Cuo.jsp";
    Cuotas cuo=new Cuotas();
    CuotasDAO dao=new CuotasDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_Cuo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Cuo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            request.setAttribute("codcuo",request.getParameter("id"));
            
            
            
            
            
            acceso=listar;            
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
