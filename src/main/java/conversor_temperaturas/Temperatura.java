package conversor_temperaturas;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Llaguno
 */
public class Temperatura {

    private String nombreUnidad;
    private String simbolo;

    public Temperatura() {
        this.nombreUnidad = "";
        this.simbolo = "";
    }

    public Temperatura(String nombreUnidad, String simbolo) {
        this.nombreUnidad = nombreUnidad;
        this.simbolo = simbolo;
    }

    public void ConvertirTemperatura(double cantidad, String unidad) {
        double temp = 0;
        String simb = " ";
        switch (unidad) {
            case "Celsius": {
                simb = "ºC";
                if (this.nombreUnidad.equalsIgnoreCase("Fahrenheit")) {
                    temp = (cantidad - 32) * 0.5556;

                } else if (this.nombreUnidad.equalsIgnoreCase("Kelvin")) {
                    temp = cantidad - 273.15;
                }
                break;
            }
            case "Fahrenheit": {
                simb = "ºF";
                if (this.nombreUnidad.equalsIgnoreCase("Celsius")) {
                    temp = (cantidad * 1.8) + 32;
                } else if (this.nombreUnidad.equalsIgnoreCase("Kelvin")) {
                    temp = ((cantidad - 273.15) * 1.8) + 32;
                }
                break;
            }
            case "Kelvin": {
                simb = "K";
                if (this.nombreUnidad.equalsIgnoreCase("Celsius")) {
                    temp = cantidad + 273.15;
                } else if (this.nombreUnidad.equalsIgnoreCase("Fahrenheit")) {
                    temp = ((cantidad - 32) * 0.5556) + 273.15;
                }
                break;
            }
        }
        String tempConv = String.format("%.2f", temp);
        JOptionPane.showMessageDialog(null, "La temperatura " + cantidad + this.simbolo + " es igual a " + tempConv + simb);
    }

    public void cargarDatos(String nombreUnidad, String simbolo) {
        setNombreUnidad(nombreUnidad);
        setSimbolo(simbolo);
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
