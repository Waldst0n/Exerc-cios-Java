package composicao1;

import composicao1.entities.Departments;
import composicao1.entities.HourContract;
import composicao1.entities.Worker;
import composicao1.entities.enums.WorkerLevel;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfIncome = new SimpleDateFormat("MM/yyyy");


        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,new Departments(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1  ; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.println(worker.getContracts());

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        String monthAtYear = sc.next();
        int month = Integer.parseInt(monthAtYear.substring(0,2));
        int year = Integer.parseInt(monthAtYear.substring(3));



        System.out.println("Name: " + worker.getName());
        System.out.println("Department " + worker.getDepartments().getName());
        System.out.println("Income for " + monthAtYear + ": " + String.format("%.2f", worker.income(year,month)));






        sc.close();
    }
}
