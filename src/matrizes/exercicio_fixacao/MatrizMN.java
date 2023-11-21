package matrizes.exercicio_fixacao;

import java.util.Scanner;

public class MatrizMN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de colunas: ");
        int m = sc.nextInt();
        System.out.println("Digite o número de linhas: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                System.out.println("Digite o " + (j +1 ) +"º número da " + (i+1) + "ª linha da matriz");

                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite o número desejado para buscar na matriz: ");
        int x = sc.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
