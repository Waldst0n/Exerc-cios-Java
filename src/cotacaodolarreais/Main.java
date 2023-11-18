package cotacaodolarreais;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the dollar price? ");

        double dolarValue = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dolarBought = scanner.nextDouble();

        CurrencyConverter.converter(dolarValue, dolarBought);

        System.out.print("Amount to be paid in reais = R$" + CurrencyConverter.getTotalPayinReais());



    }
}
