package cotacaodolarreais;

public class CurrencyConverter {
    private double dolarValue;
    private static final double  IOF = 0.06;
    private static double totalPayinReais;


    public static double converter(double dolarValue, double dolarBought) {
        return totalPayinReais = dolarValue = (dolarValue * dolarBought) + ((dolarValue * dolarBought) * IOF);
    };

    public double getDolarValue() {
        return dolarValue;
    }

    public void setDolarValue(double dolarValue) {
        this.dolarValue = dolarValue;
    }

    public static double getTotalPayinReais() {
        return totalPayinReais;
    }

    public static void setTotalPayinReais(double totalPayinReais) {
        CurrencyConverter.totalPayinReais = totalPayinReais;
    }


}
