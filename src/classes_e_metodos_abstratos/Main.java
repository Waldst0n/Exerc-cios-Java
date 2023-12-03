package classes_e_metodos_abstratos;

import classes_e_metodos_abstratos.entities.Company;
import classes_e_metodos_abstratos.entities.Individual;
import classes_e_metodos_abstratos.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            System.out.print("Tax payer #" + i + " data? (i/c)? " );
            char typePayer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (typePayer == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name,anualIncome,healthExpenditures);
                taxPayers.add(individual);

            } else {
                System.out.print("Numbers of employees: ");
                int numberEmployees = sc.nextInt();
                Company company = new Company(name,anualIncome,numberEmployees);
                taxPayers.add(company);
            }

        }

        System.out.println("TAXES PAID: ");

        for(TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer.getName() +": $ "  + String.format("%.2f",taxPayer.tax()));
        }
    }
}
