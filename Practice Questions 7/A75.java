/*5) write java programe for Armstrong Number ? */

public class A75 {
    public static void main(String[] args) {
        int num = 153;
        int n=num, sum = 0, r;
        while(n>0)
        {
            r=n%10;
            sum = (int)(sum + Math.pow(r, 3));
            n = (int)n/10;
        }
        if(sum == num)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is NOT an Armstrong number");
    }
}
