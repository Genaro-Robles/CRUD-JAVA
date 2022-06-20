
package Modelo;

/**
 *
 * @author CASA
 */
public class Cuotas {
    int numero;
    double saldo;
    double capital;
    double interes;
    int prestamos;

    public Cuotas() {
    }

    public Cuotas(int numero, double saldo, double capital, double interes, int prestamos) {
        this.numero = numero;
        this.saldo = saldo;
        this.capital = capital;
        this.interes = interes;
        this.prestamos = prestamos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }
    
}
