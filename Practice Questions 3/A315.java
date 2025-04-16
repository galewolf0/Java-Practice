//15. Write a Java program to swap two variables.

public class A315 {
    public static void main(String[] args){
        int a = 12, b = 24 , c;
        System.out.println("a = " + a + ",b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ",b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ",b = " + b);

    }
}
