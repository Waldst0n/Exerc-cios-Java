package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários serão? ");
        int n = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário # " + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id= sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário ");
            Double salary = sc.nextDouble();

            Funcionario f = new Funcionario(id,name,salary);
            list.add(f);



        }

        System.out.println(list);

        System.out.println("Agora digite o ID do funcionário que irá receber o aumento: ");


        int id = sc.nextInt();

        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (fun == null){
            System.out.println("Este número de Id não existe");
        } else {
            System.out.println("Digite  a porcentagem do aumento de salário: ");

        }

        Double percent = sc.nextDouble();

        fun.increasySalary(10);
        System.out.println("O salário atualizado de " + fun.getName() + " será " + "R$" +fun.getSalario());

    }
}
