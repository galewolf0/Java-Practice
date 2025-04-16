//8. Write a program to Menu driven program using switch statement ( Find addition, subtraction, multiplication and division of to integer numbers )

import java.util.Scanner;

public class A518 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first integer:");
        int a = input.nextInt();
        System.out.println("Input second integer:");
        int b = input.nextInt();
        System.out.println("Which operation you want to perform:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo");
        int op = input.nextInt();
        switch (op) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Error: Corresponding operator does not exist");
                break;
        }
        input.close();
    }
}
