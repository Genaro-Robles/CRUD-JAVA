
package Controlador;

import Modelo.Asociado;
import ModeloDAO.AsociadoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CASA
 */
@WebServlet(name = "Controlador_A", urlPatterns = {"/Controlador_A"})

public class Controlador_A extends HttpServlet {
    String listar="vistas/listar_Aso.jsp";
    String add="vistas/add_Aso.jsp";
    String edit="vistas/edit_Aso.jsp";
    Asociado aso=new Asociado();
    AsociadoDAO dao=new AsociadoDAO();
    int cod;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
            String ape=request.getParameter("txtApe");
            String est=request.getParameter("txtEst");
            String eps=request.getParameter("txtEps");
            String dni=request.getParameter("txtDni");
            int apo=parseInt(request.getParameter("txtApo"));
            int niv=parseInt(request.getParameter("txtNiv"));
            double sal=parseDouble(request.getParameter("txtSal"));
            int nhi=parseInt(request.getParameter("txtNhi"));
            String tel=request.getParameter("txtTel");
            String dir=request.getParameter("txtDir");
            aso.setNombre(nom);
            aso.setApellidos(ape);
            aso.setEstado(est);
            aso.setEps(eps);
            aso.setDni(dni);
            aso.setAportes(apo);
            aso.setNivel(niv);
            aso.setSalario(sal);
            aso.setNhijos(nhi);
            aso.setTelefono(tel);
            aso.setDireccion(dir);
            dao.add(aso);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("codaso",request.getParameter("cod"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            cod=Integer.parseInt(request.getParameter("txtid"));
            String nom=request.getParameter("txtNom");
            String ape=request.getParameter("txtApe");
            String est=request.getParameter("txtEst");
            String eps=request.getParameter("txtEps");
            String dni=request.getParameter("txtDni");
            int apo=parseInt(request.getParameter("txtApo"));
            int niv=parseInt(request.getParameter("txtNiv"));
            double sal=parseDouble(request.getParameter("txtSal"));
            int nhi=parseInt(request.getParameter("txtNhi"));
            String tel=request.getParameter("txtTel");
            String dir=request.getParameter("txtDir");
            aso.setCodigo(cod);
            aso.setNombre(nom);
            aso.setApellidos(ape);
            aso.setEstado(est);
            aso.setEps(eps);
            aso.setDni(dni);
            aso.setAportes(apo);
            aso.setNivel(niv);
            aso.setSalario(sal);
            aso.setNhijos(nhi);
            aso.setTelefono(tel);
            aso.setDireccion(dir);
            dao.edit(aso);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            cod=Integer.parseInt(request.getParameter("cod"));
            aso.setCodigo(cod);
            dao.eliminar(cod);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
