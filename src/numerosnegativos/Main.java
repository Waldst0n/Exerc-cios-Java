package numerosnegativos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números irá utilizar? ");

		int n = sc.nextInt();

		int[] vetor = new int[n];


		for (int i = 0; i < vetor.length ; i++) {
			System.out.println("Digite o número escolhido:");
			vetor[i] = sc.nextInt();
		}

		System.out.println("Números negativos:");

		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0 ) {
				System.out.println(vetor[i]);
			}
		}


	}
}
