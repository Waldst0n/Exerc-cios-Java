package model.exerciciocalculaareatriangulo;

import java.util.Scanner;

public class Triangle {
    public double ladoA;
    public double ladoB;
    public double ladoC;
    public double p;


    public double calculaAreaDoTriangulo(){
        p = (ladoA + ladoB + ladoC) / 2;
        double areaTriangulo = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
        System.out.println("A área é: " + areaTriangulo);
        return areaTriangulo;

    }
}
