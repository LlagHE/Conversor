package conversor_monedas;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Llaguno
 */
public class ConversorMonedas {

    private Moneda moneda;

    public ConversorMonedas() {
        this.moneda = new Moneda();
    }

    public void convertirMonedas(double monedasInput) {
        String opcion = (JOptionPane.showInputDialog(
                null,
                "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"},
                "De Pesos a Dolar")).toString();

        switch (opcion) {
            case "De Pesos a Dolar":
                moneda.cargarDatos("Dolares", "US$", 0.0035);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Pesos a Euro":
                moneda.cargarDatos("Euros", "€", 0.0032);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Pesos a Libras":
                moneda.cargarDatos("Libras", "£", 0.0027);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Pesos a Yen":
                moneda.cargarDatos("Yenes", "¥", 0.5050);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Pesos a Won Coreano":
                moneda.cargarDatos("Wones", "₩", 4.6373);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Dolar a Pesos":
                moneda.cargarDatos("Pesos", "$", 286.9319);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Euro a Pesos":
                moneda.cargarDatos("Pesos", "$", 314.6065);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Libras a Pesos":
                moneda.cargarDatos("Pesos", "$", 364.2311);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Yen a Pesos":
                moneda.cargarDatos("Pesos", "$", 1.9801);
                moneda.ConvertirMoneda(monedasInput);
                break;
            case "De Won Coreano a Pesos":
                moneda.cargarDatos("Pesos", "$", 0.2156);
                moneda.ConvertirMoneda(monedasInput);
                break;
        }
    }
}
