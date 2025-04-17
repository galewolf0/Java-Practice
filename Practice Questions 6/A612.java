/*12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0    */

import java.util.Scanner;

public class A612 {
    public static void main(String[] args){
        int sum = 0, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input five numbers:");
        for(int i=0;i<5;i++){
            n = input.nextInt();
            sum = sum + n;
        }
        System.out.println("The sum of 5 no is : " + sum);
        float avg = sum/5;
        System.out.println("The Average is : " + avg);
        input.close();
    }
}
