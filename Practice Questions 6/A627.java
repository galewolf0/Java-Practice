/*25. Write a Java program to display the number rhombus structure.

Test Data
Input the number: 7
Expected Output :

                                   
      1                                                  
     212                                                 
    32123                                                
   4321234                                               
  543212345                                              
 65432123456                                             
7654321234567                                            
 65432123456                                             
  543212345                                              
   4321234                                               
    32123                                                
     212                                                 
      1   */

import java.util.Scanner;

public class A627 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int n = input.nextInt();
        for(int i=1; i<=n;i++)
        {
            for(int s=1; s<=n-i; s++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
        input.close();
    }
}
