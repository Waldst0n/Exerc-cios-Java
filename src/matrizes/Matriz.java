package matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual número será utilizado para definir sua matriz? ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++ ) {
                System.out.println("Digite o " + (j +1 ) +"º número da " + (i+1) + "ª linha da matriz");

                mat[i][j] = sc.nextInt();
            }

        }

        System.out.print("Diagonal principal ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

       int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]  < 0) {
                    count++;
                }

            }

        }

        System.out.println();
        System.out.print("Números negativos: " + count);
        System.out.println();



        sc.close();

    }

}
