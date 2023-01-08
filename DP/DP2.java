import java.util.*;
import java.util.Scanner;

public class DP2 {
    static int n;

    public static void main(String[] args) {
        String[] arr = { "multiply", "divide", "substract" };
        int i = 0;
        for (String ar : arr) {
            println("press " + i + " for " + ar);
            i++;
        }
        var input = new Scanner(System.in);
        try {
            n = input.nextInt();
            try {
                println("you selected " + arr[n]);
            } catch (IndexOutOfBoundsException e) {
                println("you enter Wrong input: " + e);
            }
        } catch (InputMismatchException e) {
            println("Please Enter Number only " + e);
        }
        println("enter value of A and B");
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            input.close();
            var c1 = new Calculator(a, b);
            switch (n) {
                case 0:
                    println("multiplication of a and b is " + c1.multiply());
                    break;
                case 1:
                    println("Division of a from b is " + c1.divide());
                    break;
                default:
                    println("Substration of a and b is " + c1.substract());
            }
        } catch (InputMismatchException e) {
            println("Please Enter Number only " + e);
        }
    }

    public static void println(Object line) {
        System.out.println(line);
    }
}

class Calculator {
    int a;
    int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int multiply() {
        return a * b;
    }

    public double divide() {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero " + e);
            return (double)a/b;
        }
    }

    public int substract() {
        return a - b;
    }
}

