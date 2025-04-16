//6. Write a program to create simple calculator using switch Statement

public class A516 {
    public static void main(String[] args) {
        double a = 24, b = 12;
        char op = '%';
        switch (op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Error: This operator does not exist.");
                break;
        }
    }
}
