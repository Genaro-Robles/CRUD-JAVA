
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_Cuo;
import Modelo.Cuotas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CASA
 */
public class CuotasDAO implements CRUD_Cuo{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cuotas cuo=new Cuotas();
    
    @Override
    public Cuotas list(int num) {
        String sql="select * from Cuota where prestamos ="+num;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                cuo.setNumero(rs.getInt("numero"));
                cuo.setSaldo(rs.getDouble("saldo"));
                cuo.setCapital(rs.getDouble("capital"));
                cuo.setInteres(rs.getDouble("interes"));
                cuo.setPrestamos(rs.getInt("prestamos"));
            }
        } catch (Exception e) {
        }
        return cuo;
    }

    @Override
    public List listar(int num) {
        ArrayList<Cuotas>list=new ArrayList<>();
        String sql="select * from Cuota where prestamos = "+num;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cuotas cuo=new Cuotas();
                cuo.setNumero(rs.getInt("numero"));
                cuo.setSaldo(rs.getDouble("saldo"));
                cuo.setCapital(rs.getDouble("capital"));
                cuo.setInteres(rs.getDouble("interes"));
                cuo.setPrestamos(rs.getInt("prestamos"));

                list.add(cuo);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public boolean add(Cuotas cuo) {
        String sql="insert into Cuota (numero, saldo, capital, interes, prestamos)"+
                "values('"+cuo.getNumero()+"','"+cuo.getSaldo()+"','"+cuo.getCapital()+"','"+cuo.getInteres()+"','"+cuo.getPrestamos()+"')";
        
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
        String sql="delete from Cuota where prestamos="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }



    
}
