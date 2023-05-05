package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] arguments) {
        int a;
        int b;
        String func = "";

        Scanner in = new Scanner(System.in);

        // Reads a integer from the console
        // and stores into age variable
        System.out.println("Please enter +,-,*,/ : ");
        func = in.nextLine();
        System.out.println("Please enter the first number: ");
        a = in.nextInt();
        System.out.println("Please enter the second number: ");
        b = in.nextInt();
        in.close();
        if (func.toString().equals("+")) {
            add(a, b);
        } else if (func.toString().equals("-")) {
            minus(a, b);
        } else if (func.toString().equals("*")) {
            multiply(a, b);
        } else if (func.toString().equals("/")) {
            divide(a, b);
        }

    }

    public static int add(int a, int b) {
        int total;
        total = a + b;
        System.out.println("Total: " + total);
        return total;
    }

    public static int minus(int a, int b) {
        int total;
        total = a - b;
        System.out.println("Total: " + total);
        return total;
    }

    public static int multiply(int a, int b) {
        int total;
        total = a * b;
        System.out.println("Total: " + total);
        return total;
    }

    public static int divide(int a, int b) {
        int total;
        total = a / b;
        System.out.println("Total: " + total);
        return total;
    }

}