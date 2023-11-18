package exercicioestoque;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Product product1 = new Product();



        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product1.setName(scanner.nextLine());

        System.out.print("Price: ");
        product1.setPrice(scanner.nextDouble());

        System.out.print("Quantity in stock:");
        product1.addProducts(scanner.nextInt());

        System.out.println(product1);

        System.out.print("Enter the number of products to be added in stock: ");
        product1.addProducts(scanner.nextInt());

        System.out.println(product1);

        System.out.print("Enter the number of products to be removed in stock: ");
        product1.removeProducts(scanner.nextInt());

        System.out.println(product1);



    }
}
