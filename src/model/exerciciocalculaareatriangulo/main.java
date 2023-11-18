package model.exerciciocalculaareatriangulo;

import model.exerciciocalculaareatriangulo.Triangle;

import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor dos 3 lados do primeiro triângulo:");
        Triangle triangleX = new Triangle();
        triangleX.setLadoA(sc.nextDouble());
        triangleX.setLadoB(sc.nextDouble());
        triangleX.setLadoC(sc.nextDouble());

        triangleX.calculaAreaDoTriangulo();

        System.out.println("Digite o valor dos 3 lados do segundo triângulo:");
        Triangle triangleY = new Triangle();
        triangleY.setLadoA(sc.nextDouble());
        triangleY.setLadoB(sc.nextDouble());
        triangleY.setLadoC(sc.nextDouble());

        triangleY.calculaAreaDoTriangulo();

        if(triangleX.getP() > triangleY.getP()) {
            System.out.println("A maior área é a do triângulo X");
        } else  System.out.println("A maior área é a do triângulo Y");
        ;

    }


}
