package principal;

import conversor_monedas.*;
import conversor_temperaturas.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Llaguno
 */
public class Principal {

    public static void main(String[] args) {

        while (true) {
            try {
                String opciones = (JOptionPane.showInputDialog(null,
                        "Seleccione una opcion de conversion ",
                        "Menu", JOptionPane.PLAIN_MESSAGE,
                        null,
                        new Object[]{"Conversor de Monedas", "Conversor de Temperaturas"},
                        "Seleccion")).toString();

                switch (opciones) {
                    case "Conversor de Monedas": {
                        while (true) {
                            try {
                                String input = (JOptionPane.showInputDialog(null,
                                        "Ingrese la cantidad de dinero que deseas convertir:",
                                        "Input", JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        null,
                                        "")).toString();
                                double cantidad = Double.parseDouble(input);

                                if (cantidad > 0) {
                                    ConversorMonedas conversor = new ConversorMonedas();
                                    int respuesta;

                                    do {
                                        conversor.convertirMonedas(cantidad);
                                        respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                                    } while (respuesta == JOptionPane.OK_OPTION);

                                    JOptionPane.showMessageDialog(null, "Programa terminado");
                                    break;

                                } else {
                                    JOptionPane.showMessageDialog(null, "Valor inválido");
                                }

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Valor inválido");
                            } catch (NullPointerException e) {
                                break;
                            }
                        }
                        break;
                    }
                    case "Conversor de Temperaturas": {
                        while (true) {
                            try {
                                String input = (JOptionPane.showInputDialog(null,
                                        "Ingrese los grados que deseas convertir:",
                                        "Input", JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        null,
                                        "")).toString();
                                double cantidad = Double.parseDouble(input);

                                if (cantidad > 0) {
                                    ConversorTemperaturas conversor = new ConversorTemperaturas();
                                    int respuesta;

                                    do {
                                        conversor.convertirTemperaturas(cantidad);
                                        respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                                    } while (respuesta == JOptionPane.OK_OPTION);

                                    JOptionPane.showMessageDialog(null, "Programa terminado");
                                    break;

                                } else {
                                    JOptionPane.showMessageDialog(null, "Valor inválido");
                                }

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Valor inválido");
                            } catch (NullPointerException e) {
                                break;
                            }
                        }
                        break;
                    }
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }
        }
    }
}
