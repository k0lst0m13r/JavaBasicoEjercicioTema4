package clases;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        SmartPhone whingChun2000 = new SmartPhone(5, 4.7, true, "ChinaPhone", false);
        System.out.println(whingChun2000.marca);
        System.out.println(whingChun2000.medidaPantalla);
        System.out.println(whingChun2000.duracionBat);
        System.out.println(whingChun2000.bluetooth3Punto0);
        System.out.println(whingChun2000.tecnologia5G);

        System.out.println("__________________"); //separador


        SmartWatch slim765 = new SmartWatch(12, 1.2, true, "Sumsang", true);
        System.out.println(slim765.marca);
        System.out.println(slim765.medidaPantalla);
        System.out.println(slim765.duracionBat);
        System.out.println(slim765.cuadranteSlim);
        System.out.println(slim765.bluetooth3Punto0);
    }



}