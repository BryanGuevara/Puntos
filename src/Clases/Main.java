package Clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion de variables y scanner
        Scanner scanner = new Scanner(System.in);
        int c, v, i, t, s, e;

        //Ingreso de datos de respuestas Correctas
        System.out.println("=============[Respuestas]==========");
        System.out.println("                                   ");
        System.out.print("Ingrese las Respuestas Correctas: ");
        c = scanner.nextInt();

        //Ingreso de datos de respuestas Incorrectas
        System.out.println("===================================");
        System.out.print("Ingrese las Respuestas Inctorrectas: ");
        i = scanner.nextInt();

        //Ingreso de datos de respuestas Vacias
        System.out.println("===================================");
        System.out.print("Ingrese las Respuestas Vacias: ");
        v = scanner.nextInt();

        //suma de puntos
        s = c * 3;

        e = i * 2;

        t = s - e;

        c = c + i + v;

        //Imprimir datos en pantalla
        System.out.println("                                   ");
        System.out.println("===============[Total]=============");
        System.out.println("                                   ");
        System.out.println("Total de Respuestas: " + c);
        System.out.println("                                   ");
        System.out.println("Los puntos totales son: " + t);
        System.out.println("                                   ");
        System.out.println("===================================");
    }

}
