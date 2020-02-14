/*
 SUBPROGRAMAS METODOS: FUNCTION + PROCEDIMIENTOS 
 CONVERSIONES
 */
package p17v2;

import java.util.Scanner;

public class P17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;

        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 11:
                    p11();
                    break;
                case 1:
                    p1();
                    break;
                case 2:
                    p2();
                    break;
                case 3:
                    p3();
                    break;
                case 4:
                    p4();
                    break;
                case 5:
                    p5();
                    break;
                case 6:
                    p6();
                    break;
                case 7:
                    p7();
                    break;
                case 8:
                    p8();
                    break;
                case 9:
                    p9();
                    break;
                case 10:
                    p10();
                    break;
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//fin switch
        }
    }

    private static void p11() {
        System.out.println("*****  Opction 11: Example *****");
        double price, tax, pvp;

        price = 100;
        tax = 21;
        pvp = functionGerard(price, tax);
        System.out.println(pvp);
    }//FIN MAIN

    private static double functionGerard(double precio, double iva) {
        double result = 0;
        result = precio + precio * iva / 100;
        return result;
    }

    private static Float p1() {
        System.out.println("*****  Opction 1 *****");
        System.out.print("Euros: ");
        int euros = keyboard.nextInt();
        Float monedaX = Float.valueOf(euros);
        System.out.println("Euros in float: " + monedaX + "x");
        return monedaX;

    }

    private static void p2() {
        System.out.println("*****  Opction 2 *****");
        System.out.print("Euros: ");
        int euros = keyboard.nextInt();
        Double monedaX = Double.valueOf(euros);
        System.out.println("Euros in Double: " + monedaX + "x");

    }

    private static void p3() {
        System.out.println("*****  Opction 3 *****");
        System.out.print("Euros: ");
        int euros = keyboard.nextInt();
        String monedaX = String.valueOf(euros);
        System.out.println("Euros in String: " + monedaX + "x");
    }

    private static void p4() {
        System.out.println("*****  Opction 4 *****");
        System.out.print("Euros: ");
        String euros = keyboard.next();
        int monedaX = Integer.parseInt(euros);
        System.out.println("Euros in Int: " + monedaX + "x");
    }

    private static void p5() {
        System.out.println("*****  Opction 5 *****");
        System.out.print("Euros: ");
        Float euros = keyboard.nextFloat();
       // int monedaX = Integer.valueOf(euros);
       // System.out.println("Euros in Int: " + monedaX + "x");
    }

    private static void p6() {
        System.out.println("*****  Opction 6 *****");
        System.out.print("Euros: ");
        Float euros = keyboard.nextFloat();
        String monedaX = String.valueOf(euros);
        System.out.println("Euros in String: " + monedaX + "x");
    }

    private static void p7() {
        System.out.println("*****  Opction 7 *****");
        System.out.print("Euros: ");
        int euros = keyboard.nextInt();
        Double monedaX = Double.valueOf(euros);
        System.out.println("Euros in Double: " + monedaX + "x");
    }

    private static void p8() {
        System.out.println("*****  Opction 8 *****");

    }

    private static void p9() {
        System.out.println("*****  Opction 9 *****");

    }

    private static void p10() {
        System.out.println("*****  Opction 10  *****");

    }

    private static void p0() {
        System.out.println("");
        System.out.println("gracias ......     adeu");
    }

    private static void userMenu() {
        System.out.println();
        System.out.println("Opción 1- (--)");
        System.out.println("Opción 11- (--)");
        System.out.println("Opción 2- (--)");
        System.out.println("Opción 3-(--)");
        System.out.println("Opción 4-(--)");
        System.out.println("Opción 5- (--)");
        System.out.println("Opción 6- (--):");
        System.out.println("Opción 7- (--):");
        System.out.println("Opción 8- (--)):");
        System.out.println("Opción 9- (--):");
        System.out.println("Opción 10- (--):");
        System.out.println("Opción 0- salir");
        System.out.print("\nOpcion ?: ");
    }
}

//FIN CLASS

