
package ModeloDAO;

import Config.Conexion;
import Modelo.Asociado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD_A;
/**
 *
 * @author CASA
 */
public class AsociadoDAO implements CRUD_A{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Asociado aso=new Asociado();

    @Override
    public List listar() {
        ArrayList<Asociado>list=new ArrayList<>();
        String sql="select * from Asociado";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Asociado aso=new Asociado();
                aso.setCodigo(rs.getInt("codigo"));
                aso.setNombre(rs.getString("nombre"));
                aso.setApellidos(rs.getString("apellidos"));
                aso.setEstado(rs.getString("estado"));
                aso.setEps(rs.getString("eps"));
                aso.setDni(rs.getString("dni"));
                aso.setAportes(rs.getInt("aportes"));
                aso.setNivel(rs.getInt("nivel_estudio"));
                aso.setSalario(rs.getDouble("salario"));
                aso.setNhijos(rs.getInt("numero_hijos"));
                aso.setTelefono(rs.getString("telefono"));
                aso.setDireccion(rs.getString("direccion"));
                list.add(aso);
            }
        } catch (Exception e) {
        }
        return list;
    }
    

    @Override
    public Asociado list(int codigo) {
        String sql="select * from Asociado where codigo="+codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                aso.setCodigo(rs.getInt("codigo"));
                aso.setNombre(rs.getString("nombre"));
                aso.setApellidos(rs.getString("apellidos"));
                aso.setEstado(rs.getString("estado"));
                aso.setEps(rs.getString("eps"));
                aso.setDni(rs.getString("dni"));
                aso.setAportes(rs.getInt("aportes"));
                aso.setNivel(rs.getInt("nivel_estudio"));
                aso.setSalario(rs.getDouble("salario"));
                aso.setNhijos(rs.getInt("numero_hijos"));
                aso.setTelefono(rs.getString("telefono"));
                aso.setDireccion(rs.getString("direccion"));
                
            }
        } catch (Exception e) {
        }
        return aso;
    }

    @Override
    public boolean add(Asociado aso) {
        String sql="insert into Asociado ( nombre,apellidos,estado,eps,dni,aportes,nivel_estudio,salario,numero_hijos,telefono,direccion)"+
        "values('"+aso.getNombre()+"','"+aso.getApellidos()+"','"+aso.getEstado()+"','"+aso.getEps()+"','"+aso.getDni()+"','"+aso.getAportes()+"','"+aso.getNivel()+"','"+aso.getSalario()+"','"+aso.getNhijos()+"','"+aso.getTelefono()+"','"+aso.getDireccion()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Asociado aso) {
        String sql="update Asociado set nombre='"+aso.getNombre()+"',apellidos='"+aso.getApellidos()+"',estado='"+aso.getEstado()+"',eps='"+aso.getEps()+"',dni='"+aso.getDni()+"',aportes='"+aso.getAportes()+"',nivel_estudio='"+aso.getNivel()+
                "',salario='"+aso.getSalario()+"',numero_hijos='"+aso.getNhijos()+"',telefono='"+aso.getTelefono()+"',direccion='"+aso.getDireccion()+"'where codigo="+aso.getCodigo();
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
        String sql="delete from Asociado where codigo="+codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
}
