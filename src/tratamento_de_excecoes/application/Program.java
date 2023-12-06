package tratamento_de_excecoes.application;

import tratamento_de_excecoes.entities.Account;
import tratamento_de_excecoes.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account Data");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account ac1 = new Account(number,holder,balance,withdrawLimit);

        try {
            System.out.print("Enter amount for withdraw: ");
            ac1.withdraw(sc.nextDouble());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(ac1);



        sc.close();
    }
}
