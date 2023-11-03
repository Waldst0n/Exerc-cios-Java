package model.exerciciocalculaareatriangulo;

import model.exerciciocalculaareatriangulo.Triangle;

import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor dos 3 lados do primeiro triângulo:");
        Triangle triangleX = new Triangle();
        triangleX.ladoA = sc.nextDouble();
        triangleX.ladoB = sc.nextDouble();
        triangleX.ladoC = sc.nextDouble();

        triangleX.calculaAreaDoTriangulo();

        System.out.println("Digite o valor dos 3 lados do segundo triângulo:");
        Triangle triangleY = new Triangle();
        triangleY.ladoA = sc.nextDouble();
        triangleY.ladoB = sc.nextDouble();
        triangleY.ladoC = sc.nextDouble();

        triangleY.calculaAreaDoTriangulo();

        if(triangleX.p > triangleY.p) {
            System.out.println("A maior área é a do triângulo X");
        } else  System.out.println("A maior área é a do triângulo Y");
        ;

    }


}
