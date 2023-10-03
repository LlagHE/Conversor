package conversor_temperaturas;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Llaguno
 */
public class ConversorTemperaturas {

    private Temperatura temperatura;

    public ConversorTemperaturas() {
        this.temperatura = new Temperatura();
    }

    public void convertirTemperaturas(double temperaturaInput) {
        String opcion = (JOptionPane.showInputDialog(
                null,
                "Elije la unidad a la que deseas convertir la temperatura",
                "Unidades",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"},
                "De Celsius a Fahrenheit")).toString();

        switch (opcion) {
            case "De Celsius a Fahrenheit":
                temperatura.cargarDatos("Celsius", "ºC");
                temperatura.ConvertirTemperatura(temperaturaInput, "Fahrenheit");
                break;
            case "De Celsius a Kelvin":
                temperatura.cargarDatos("Celsius", "ºC");
                temperatura.ConvertirTemperatura(temperaturaInput, "Kelvin");
                break;
            case "De Fahrenheit a Celsius":
                temperatura.cargarDatos("Fahrenheit", "ºF");
                temperatura.ConvertirTemperatura(temperaturaInput, "Celsius");
                break;
            case "De Fahrenheit a Kelvin":
                temperatura.cargarDatos("Fahrenheit", "ºF");
                temperatura.ConvertirTemperatura(temperaturaInput, "Kelvin");
                break;
            case "De Kelvin a Celsius":
                temperatura.cargarDatos("Kelvin", "K");
                temperatura.ConvertirTemperatura(temperaturaInput, "Celsius");
                break;
            case "De Kelvin a Fahrenheit":
                temperatura.cargarDatos("Kelvin", "K");
                temperatura.ConvertirTemperatura(temperaturaInput, "Fahrenheit");
                break;
        }
    }
}
