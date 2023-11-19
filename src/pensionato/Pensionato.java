package pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        Rent[] vect = new Rent[10];


        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();

            System.out.println("Room: ");
            int roomNumber = sc.nextInt();
            Rent rent = new Rent(name,email);

            vect[roomNumber] = rent;

        }

        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }




        sc.close();

    }
}
