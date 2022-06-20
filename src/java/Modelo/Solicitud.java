
package Modelo;


import java.util.Date;



/**
 *
 * @author CASA
 */
public class Solicitud {
    int id;
    int cod;
    int cuotas;
    double monto;
    private Date fecha;
    String motivo;
    double taza;
    String estado;

    public Solicitud() {
        
    }

    public Solicitud(int cod, int cuotas, double monto, Date fecha, String motivo, double taza, String estado) {
        this.cod = cod;
        this.cuotas = cuotas;
        this.monto = monto;
        this.fecha = fecha;
        this.motivo = motivo;
        this.taza = taza;
        this.estado = estado;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
