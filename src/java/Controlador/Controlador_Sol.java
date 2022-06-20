
package Controlador;

import Modelo.Cuotas;
import Modelo.Solicitud;
import ModeloDAO.CuotasDAO;
import ModeloDAO.SolicitudDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "Controlador_Sol", urlPatterns = {"/Controlador_Sol"})
public class Controlador_Sol extends HttpServlet {

    String listar="vistas/listar_Sol.jsp";
    String add="vistas/add_Sol.jsp";
    String edit="vistas/edit_Sol.jsp";
    Solicitud sol=new Solicitud();
    SolicitudDAO dao=new SolicitudDAO();
    Cuotas cuo=new Cuotas();
    CuotasDAO daoC=new CuotasDAO();
    int id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_Sol</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Sol at " + request.getContextPath() + "</h1>");
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
        } else if(action.equalsIgnoreCase("Agregar")){
        try {
            // Agregar Solicitud
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                int cod=Integer.parseInt(request.getParameter("txtcod"));
                int cuotas=Integer.parseInt(request.getParameter("txtCuo"));
                double monto=Double.parseDouble(request.getParameter("txtMon"));
                java.util.Date fecha = sdf.parse(request.getParameter("txtFecha"));
                Date fecha_sol = new java.sql.Date(fecha.getTime());
                String motivo=request.getParameter("txtMot");
                double taza=Double.parseDouble(request.getParameter("txtTaza"));
                String estado=request.getParameter("txtEstado");
                                
                sol.setCod(cod);
                sol.setCuotas(cuotas);
                sol.setMonto(monto);
                sol.setFecha(fecha_sol);
                sol.setMotivo(motivo);
                sol.setTaza(taza);
                sol.setEstado(estado);
                
                dao.add(sol);
                
                
                List<Solicitud>list=dao.listarUltimo();
                Iterator<Solicitud>iter=list.iterator();
                    while(iter.hasNext()){
                        sol=iter.next();    
                            id=sol.getId();
                    }
            // Datos Cuotas
               double Capital = monto/cuotas;
               double interes = monto * (taza/100);
               double saldo = (monto + interes)/cuotas;
               double CInteres = interes / cuotas;

            // Agregar Cuotas
                for (int i=0;i<cuotas;i++){
                    cuo.setNumero(i+1);
                    cuo.setSaldo(saldo);
                    cuo.setCapital(Capital);
                    cuo.setInteres(CInteres);
                    cuo.setPrestamos(id);
                    
                    daoC.add(cuo);
                }
                    
                
                acceso=listar;
                
            } catch (ParseException ex) {
                Logger.getLogger(Controlador_Sol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("codsol",request.getParameter("id"));
            acceso=edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            try {
                
            id=Integer.parseInt(request.getParameter("txtid"));
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            int cod=Integer.parseInt(request.getParameter("txtcod"));
            int cuotas=Integer.parseInt(request.getParameter("txtCuo"));
            double monto=Double.parseDouble(request.getParameter("txtMon"));
            java.util.Date fecha = sdf.parse(request.getParameter("txtFecha"));
            Date fecha_sol = new java.sql.Date(fecha.getTime());
            String motivo=request.getParameter("txtMot");
            double taza=Double.parseDouble(request.getParameter("txtTaza"));
            String estado=request.getParameter("txtEstado");
            
            sol.setId(id);
            sol.setCod(cod);
            sol.setCuotas(cuotas);
            sol.setMonto(monto);
            sol.setFecha(fecha_sol);
            sol.setMotivo(motivo);
            sol.setTaza(taza);
            sol.setEstado(estado);
            dao.edit(sol);
            acceso=listar;
            
            }catch (ParseException ex) {
              Logger.getLogger(Controlador_Sol.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("id"));
            sol.setId(id);
            cuo.setPrestamos(id);
            daoC.eliminar(id);
            dao.eliminar(id);
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
