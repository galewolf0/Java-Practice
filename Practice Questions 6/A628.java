/*26. Write a Java program to display the following character rhombus structure.

Test Data
Input the number: 7
Expected Output :

                                      
      A                                                  
     ABA                                                 
    ABCBA                                                
   ABCDCBA                                               
  ABCDEDCBA                                              
 ABCDEFEDCBA                                             
ABCDEFGFEDCBA                                            
 ABCDEFEDCBA                                             
  ABCDEDCBA                                              
   ABCDCBA                                               
    ABCBA                                                
     ABA                                                 
      A  */

import java.util.Scanner;

public class A628 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int n = input.nextInt();
        for(int i=1; i<=n;i++)
        {
            for(int s=1; s<=n-i; s++)
                System.out.print(" ");
            for(char ch = 'A'; ch<'A'+i; ch++)
                System.out.print(ch);
            for(char ch = (char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int s=1;s<=n-i;s++)
                System.out.print(" ");
            for(char ch = 'A'; ch<'A'+i;ch++)
                System.out.print(ch);
            for(char ch = (char)('A'+i-2); ch>='A'; ch--)
                System.out.print(ch);
            System.out.println();
        }               
        input.close();
    }
}
