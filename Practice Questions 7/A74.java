/*
 4) write java program for Factorial 
Ex:
Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:

4! = 4*3*2*1 = 24  
5! = 5*4*3*2*1 = 120 
 */

public class A74 {
    public static void main(String[] args) {
        int num = 5;
        int i=num;
        int fact=1;
        while(i>1)
        {
            fact = fact * i;
            i--;
        }
        System.out.println(num + "! = " + fact);

    }
}
