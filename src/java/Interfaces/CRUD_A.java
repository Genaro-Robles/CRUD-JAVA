
package Interfaces;
import Modelo.Asociado;
import java.util.List;
/**
 *
 * @author CASA
 */
public interface CRUD_A {
    public List listar();
    public Asociado list(int codigo);
    public boolean add(Asociado aso);
    public boolean edit(Asociado aso);
    public boolean eliminar(int codigo);
}
