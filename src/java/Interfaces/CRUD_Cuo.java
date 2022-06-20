
package Interfaces;

import Modelo.Cuotas;
import java.util.List;

/**
 *
 * @author CASA
 */
public interface CRUD_Cuo {
    public Cuotas list(int num);
    public List listar(int num);
    public boolean add(Cuotas cuo);
    public boolean eliminar(int id);
}
