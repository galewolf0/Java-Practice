//6) How to Generate Random Number in Java

import java.util.Random;

public class A76 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("Random number: " + num);
    }
}
