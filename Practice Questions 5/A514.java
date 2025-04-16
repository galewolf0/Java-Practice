//4. Write a program to Check whether the number is even or odd using switch statement

public class A514 {
    public static void main(String[] args) {
        int num = 12;
        switch (num%2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
        }
    }
}
