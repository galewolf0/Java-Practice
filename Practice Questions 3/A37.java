//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

public class A37 {
    public static void main(String[] args){
        int num = 8;
        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));
    }
}
