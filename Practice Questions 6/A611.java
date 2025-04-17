/*11. Write a Java program to display n terms of natural numbers and their sum.

Test Data
Input the number: 2
Expected Output :

Input number:                                                                    
2                                                                                
The first n natural numbers are :                                                
2                                                                                
1                                                                                
2                                                                                
The Sum of Natural Number upto n terms :                                         
23
*/

public class A611 {
    public static void main(String[] args) {
        int n=2;
        int sum=0;
        System.out.println("The first " + n + " natural numbers are:");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("The sum of Natural numbper upto " + n + " terms: " + sum);
    }
}
