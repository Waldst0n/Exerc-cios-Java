package polimorfismo1.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (outsourced == 'y') {
                System.out.print("Aditional charge: ");
                double additionalCH = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name,hours, valuePerHour, additionalCH);
                employees.add(emp);

            } else {
                Employee emp = new Employee(name,hours, valuePerHour);
                employees.add(emp);
            }
        }


        System.out.println();
        System.out.println("PAYMENTS");

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " -$ " + String.format("%.2f",emp.payment()));
        }





        sc.close();

    }
}
