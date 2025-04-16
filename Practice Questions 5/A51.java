//1. Write a Java program to get a number from the user and print whether it is positive or negative.

//Test Data
//Input number: 35
//Expected Output :
//Number is positive

public class A51{
    public static void main(String[] args){
        int num = 35;
        if(num>0)
        System.out.println("Number is positive");
        else if(num<0)
        System.out.println("Number is negative.");
        else
        System.out.println("Number is Zero.");
    }
}