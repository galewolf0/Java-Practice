/*
 3) write java program for Palindrome 
Ex:
Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.

 */

public class A73 {
    public static void main(String[] args) {
        String S = "15351";
        int l = S.length();
        int flag=1;
        for(int i=0; i<l/2 ;i++)
        {
            if(S.charAt(i) != S.charAt(l-i-1))
            {
                flag = 0;
                break;
            }
        }
        if(flag==1)
            System.out.print("Palindrome");
        else
            System.out.println("NOT Palindrome");
    }
}
