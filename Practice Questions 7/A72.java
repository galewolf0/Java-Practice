/*2) write java programe for Prime Number
   ex: Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */

public class A72 {
    public static void main(String[] args) {
        int num=4;
        int flag = 1;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag = 0;
                break;
            }
        }
        if(flag==1)
            System.out.print("Prime Number");
        else
            System.out.println("NOT a Prime Number");
    }
}
