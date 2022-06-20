
package ModeloDAO;
import Config.Conexion;
import Modelo.Soportes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_Sop;
/**
 *
 * @author CASA
 */
public class SoportesDAO implements CRUD_Sop {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Soportes sop=new Soportes();

    @Override
    public List listar() {
        ArrayList<Soportes>list=new ArrayList<>();
        String sql="select * from Soportes";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Soportes sop=new Soportes();
                sop.setCodigo(rs.getInt("codigo"));
                sop.setNombre(rs.getString("nombre"));
                sop.setContenido(rs.getString("contenido"));
                sop.setSolicitud(rs.getInt("solicitud"));
                list.add(sop);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Soportes list(int codigo) {
        String sql="select * from Soportes where codigo="+codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                sop.setCodigo(rs.getInt("codigo"));
                sop.setNombre(rs.getString("nombre"));
                sop.setContenido(rs.getString("contenido"));
                sop.setSolicitud(rs.getInt("solicitud"));
                
            }
        } catch (Exception e) {
        }
        return sop;
    }

    @Override
    public boolean add(Soportes sop) {
        String sql="insert into Soportes (nombre,contenido,solicitud) values('"+sop.getNombre()+"','"+sop.getContenido()+"','"+sop.getSolicitud()+"')";
        
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Soportes sop) {
        String sql="update Soportes set nombre='"+sop.getNombre()+"', contenido='"+sop.getContenido()+"', solicitud='"+sop.getSolicitud()+"'where codigo="+sop.getCodigo();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int codigo) {
        String sql="delete from Soportes where codigo="+codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}

