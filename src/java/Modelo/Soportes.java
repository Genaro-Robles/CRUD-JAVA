
package Modelo;

/**
 *
 * @author CASA
 */
public class Soportes {
   int codigo;
   String nombre;
   String contenido;
   int solicitud;

    public Soportes() {
        
    }

    public Soportes(String nombre, String contenido, int solicitud) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.solicitud = solicitud;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(int solicitud) {
        this.solicitud = solicitud;
    }
   
   
}
