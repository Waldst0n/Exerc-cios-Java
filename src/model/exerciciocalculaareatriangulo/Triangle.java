package model.exerciciocalculaareatriangulo;

import java.util.Scanner;

public class Triangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double p;


    public double getLadoA() {
        return ladoA;
    }

    public double getP() {
        return p;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double calculaAreaDoTriangulo(){
        p = (ladoA + ladoB + ladoC) / 2;
        double areaTriangulo = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
        System.out.println("A área é: " + areaTriangulo);
        return areaTriangulo;

    }
}
