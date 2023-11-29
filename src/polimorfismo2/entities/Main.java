package polimorfismo2.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main  {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");

            System.out.println("Common, used or imported? (c/u/i) ");

            char cui = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (cui == 'i') {
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customFee);
                products.add(product);
            } else if (cui == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                Date manufactureDate = sdf.parse(sc.nextLine());
                Product product = new UsedProduct(name, price, manufactureDate);
                products.add(product);

            } else {
                Product product = new Product(name, price);
                products.add(product);
            }

        }

            System.out.println();
            System.out.println("PRICE TAGS");
            for(Product p : products) {
                System.out.println(p.priceTag());
            }




        sc.close();
    }
}
