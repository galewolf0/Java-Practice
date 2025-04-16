//9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.

//Test Data
//Input the year: 2016
//Expected Output :
//2016 is a leap year

public class A59 {
    public static void main(String[] args) {
        int year = 2016;
        if(year%4==0)
        System.out.println(year + " is a leap year");
        else
        System.out.println(year + " is NOT a leap year");
    }
}
