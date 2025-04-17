/*15. Write a Java program that displays the sum of n odd natural numbers.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25 */

import java.util.Scanner;

public class A615 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms is: ");
        int n = input.nextInt();
        System.out.println("The odd numbers are :");
        for(int i = 0, odd = 1; i<n; i++)
        {
            System.out.println(odd);
            sum = sum + odd;
            odd += 2;
        }
        System.out.println("The Sum of odd Natural Number upto " + 5 + " terms is: " + sum);
        input.close();
    }
}
