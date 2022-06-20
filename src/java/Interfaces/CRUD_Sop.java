
package Interfaces;
import Modelo.Soportes;
import java.util.List;
/**
 *
 * @author CASA
 */
public interface CRUD_Sop {
  public List listar();
    public Soportes list(int codigo);
    public boolean add(Soportes sop);
    public boolean edit(Soportes sop);
    public boolean eliminar(int codigo);  
}
