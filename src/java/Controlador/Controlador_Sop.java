
package Controlador;

import Modelo.Soportes;
import ModeloDAO.SoportesDAO;
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
@WebServlet(name = "Controlador_Sop", urlPatterns = {"/Controlador_Sop"})
public class Controlador_Sop extends HttpServlet {
    String listar="vistas/listar_Sop.jsp";
    String add="vistas/add_Sop.jsp";
    String edit="vistas/edit_Sop.jsp";
    Soportes sop=new Soportes();
    SoportesDAO dao=new SoportesDAO();
    int cod;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_Sop</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Sop at " + request.getContextPath() + "</h1>");
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
            acceso=listar;            
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            String nom=request.getParameter("txtNom");
            String cont=request.getParameter("txtCont");
            int sol= parseInt(request.getParameter("txtSol"));
            sop.setNombre(nom);
            sop.setContenido(cont);
            sop.setSolicitud(sol);
            dao.add(sop);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("codsop",request.getParameter("cod"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            cod=Integer.parseInt(request.getParameter("txtcod"));
            String nom=request.getParameter("txtNom");
            String cont=request.getParameter("txtCont");
            int sol= parseInt(request.getParameter("txtSol"));
            sop.setCodigo(cod);
            sop.setNombre(nom);
            sop.setContenido(cont);
            sop.setSolicitud(sol);
            dao.edit(sop);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            cod=Integer.parseInt(request.getParameter("cod"));
            sop.setCodigo(cod);
            dao.eliminar(cod);
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
