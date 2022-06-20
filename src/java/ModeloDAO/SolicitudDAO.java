
package ModeloDAO;

import Config.Conexion;
import Modelo.Solicitud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_Sol;

/**
 *
 * @author CASA
 */
public class SolicitudDAO implements CRUD_Sol {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Solicitud sol=new Solicitud();
    
    @Override
    public List listar() {
        ArrayList<Solicitud>list=new ArrayList<>();
        String sql="select * from Solicitud";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Solicitud sol=new Solicitud();
                sol.setId(rs.getInt("id"));
                sol.setCod(rs.getInt("cod"));
                sol.setCuotas(rs.getInt("cuotas"));
                sol.setMonto(rs.getDouble("monto"));
                sol.setFecha(rs.getDate("fecha"));
                sol.setMotivo(rs.getString("motivo"));
                sol.setTaza(rs.getDouble("taza"));
                sol.setEstado(rs.getString("estado"));

                list.add(sol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Solicitud list(int id) {
        String sql="select * from Solicitud where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                sol.setId(rs.getInt("id"));
                sol.setCod(rs.getInt("cod"));
                sol.setCuotas(rs.getInt("cuotas"));
                sol.setMonto(rs.getDouble("monto"));
                sol.setFecha(rs.getDate("fecha"));
                sol.setMotivo(rs.getString("motivo"));
                sol.setTaza(rs.getDouble("taza"));
                sol.setEstado(rs.getString("estado"));
                
            }
        } catch (Exception e) {
        }
        return sol;
    }

    

    @Override
    public boolean edit(Solicitud sol) {
        String sql="update Solicitud set cod='"+sol.getCod()+"',cuotas='"+sol.getCuotas()+"',monto='"+sol.getMonto()+"',fecha='"+sol.getFecha()+"',motivo='"+sol.getMotivo()+"',taza='"+sol.getTaza()+"',estado='"+sol.getEstado()+
                "'where id="+sol.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from Solicitud where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean add(Solicitud sol) {
        String sql="insert into Solicitud (cod,cuotas,monto,fecha,motivo,taza,estado)"+
                "values('"+sol.getCod()+"','"+sol.getCuotas()+"','"+sol.getMonto()+"','"+sol.getFecha()+"','"+sol.getMotivo()+"','"+sol.getTaza()+"','"+sol.getEstado()+"')";
        
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public List listarUltimo() {
        ArrayList<Solicitud>list=new ArrayList<>();
        String sql="select top 1 * from Solicitud order by id desc";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Solicitud sol=new Solicitud();
                sol.setId(rs.getInt("id"));
                sol.setCod(rs.getInt("cod"));
                sol.setCuotas(rs.getInt("cuotas"));
                sol.setMonto(rs.getDouble("monto"));
                sol.setFecha(rs.getDate("fecha"));
                sol.setMotivo(rs.getString("motivo"));
                sol.setTaza(rs.getDouble("taza"));
                sol.setEstado(rs.getString("estado"));

                list.add(sol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public List listarGrafico() {
        ArrayList<Solicitud>list=new ArrayList<>();
        String sql="select count(id) as cantidad,YEAR(fecha) as fecha from Solicitud group by year(fecha)";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Solicitud sol=new Solicitud();
                sol.setId(rs.getInt("cantidad"));
                sol.setCod(rs.getInt("fecha"));

                list.add(sol);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
}
