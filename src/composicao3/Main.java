package composicao3;

import composicao3.model.entities.Client;
import composicao3.model.entities.Order;
import composicao3.model.entities.OrderItem;
import composicao3.model.entities.Product;
import composicao3.model.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.println("Birth date: ");
        Date birthDate = sdf.parse(scanner.nextLine());

        Client cl1 = new Client(name,email,birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.nextLine());
        System.out.print("How many items to this order? ");
        int n = scanner.nextInt();

        Order order = new Order(new Date(), status, cl1);

        for (int i = 1; i <= n ; i++) {
            scanner.nextLine();
            System.out.println("enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productname = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            Product product = new Product(productname, productPrice);



            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            OrderItem orderItem = new OrderItem(quantity,productPrice,product);
            order.addItem(orderItem);

        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
        scanner.close();



    }
}
