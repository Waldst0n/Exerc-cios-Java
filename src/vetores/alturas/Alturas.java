package vetores.alturas;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Quantas pessoas serão? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();

        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += alturas[i];
        }

        double media = sum / alturas.length;

        System.out.printf("A media das alturas é: %.1f%n",  media);

        int menor16 = 0;

        for (int i = 0; i < idades.length; i++) {

            if(idades[i] < 16) {
                menor16++;
            }
        }

        double porcentagemMenor16 = (menor16 * 100.0) / idades.length;

        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenor16);

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }



        sc.close();


    }
}
