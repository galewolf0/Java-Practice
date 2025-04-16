//4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

//Test Data
//Input a number: 25
//Expected Output :
//Input value: 25
//Positive number

public class A54 {
    public static void main(String[] args){
        double num = 25;
        double absValue = Math.abs(num);
        if(num>0)
        {
            if(absValue < 1)
            System.out.println("Positive small number");
            else if(absValue > 1000000)
            System.out.println("positive large number");
            else
            System.out.println("positive number");
        }
        else if(num<0)
        {
            if(absValue < 1)
            System.out.println("Negative small number");
            else if(absValue > 1000000)
            System.out.println("Negative large number");
            else
            System.out.println("Negative number");
        }
        else
        System.out.println("Number is Zero.");
    }
}
