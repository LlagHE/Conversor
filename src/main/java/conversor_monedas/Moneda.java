package conversor_monedas;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Llaguno
 */
public class Moneda {

    private String nombre;
    private String simbolo;
    private double tasaDeCambio;

    public Moneda() {
        this.nombre = "";
        this.simbolo = "";
        this.tasaDeCambio = 0;
    }

    public Moneda(String nombre, String simbolo, double tasaDeCambio) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.tasaDeCambio = tasaDeCambio;
    }

    public void ConvertirMoneda(double cantidad) {
        double moneda = cantidad * this.tasaDeCambio;
        String monedaConv = String.format("%.2f", moneda);
        JOptionPane.showMessageDialog(null, "Tienes " + this.simbolo + " " + monedaConv + " " + this.nombre);
    }
    
    public void cargarDatos(String nombre, String simbolo, double tasaDeCambio) {
        setNombre(nombre);
        setSimbolo(simbolo);
        setTasaDeCambio(tasaDeCambio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }
}
