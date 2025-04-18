/*
 1.write java program for Fibonacci series 
Ex:
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

 */

public class A71{
    public static void main(String[] args) {
        int num = 11;
        int x = 0, y = 1;
        if(num == 1)
            System.out.print(x);
        if(num == 2)
            System.out.print(x + " " + y);
            if(num>2)
        {   
            int z;
            System.out.print(x + " " + y);
            for(int i = 3;i<=num; i++)
            {
                z = x + y;
                System.out.print(" " + z);
                x = y;
                y = z;
            }
        }
            
    }
}