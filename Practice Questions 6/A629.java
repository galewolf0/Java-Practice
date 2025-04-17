/*
 27. Write a Java program that reads an integer and check whether it is negative, zero, or positive.

Test Data
Input a number: 7
Expected Output :

Number is positive
 */

public class A629 {
    public static void main(String[] args) {
        int num = 7;
        if(num>0)
        System.out.println("Number is positive");
        else if(num<0)
        System.out.println("Number is negative.");
        else
        System.out.println("Number is Zero.");
    }
}
