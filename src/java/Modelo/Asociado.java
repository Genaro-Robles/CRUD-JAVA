
package Modelo;

/**
 *
 * @author CASA
 */
public class Asociado {
    int codigo;
    String nombre;
    String apellidos;
    String estado;
    String eps;
    String dni;
    int aportes;
    int nivel;
    double salario;
    int nhijos;
    String telefono;
    String direccion;

    public Asociado() {
        
    }
    
    public Asociado(String nombre, String apellidos, String estado, String eps, String dni, int aportes, int nivel, double salario, int nhijos, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
        this.eps = eps;
        this.dni = dni;
        this.aportes = aportes;
        this.nivel = nivel;
        this.salario = salario;
        this.nhijos = nhijos;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAportes() {
        return aportes;
    }

    public void setAportes(int aportes) {
        this.aportes = aportes;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNhijos() {
        return nhijos;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
