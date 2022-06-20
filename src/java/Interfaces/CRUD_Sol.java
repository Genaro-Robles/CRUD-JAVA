package Interfaces;
import Modelo.Solicitud;
import java.util.List;

/**
 *
 * @author CASA
 */
public interface CRUD_Sol {
    public List listar();
    public Solicitud list(int id);
    public boolean add(Solicitud sol);
    public boolean edit(Solicitud sol);
    public boolean eliminar(int id);
    public List listarUltimo();
    public List listarGrafico();
}
