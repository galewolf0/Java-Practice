/*24. Write a Java program to generate the following @'s triangle.

Test Data
Input the number: 6
Expected Output :

      @                                                  
     @@                                                  
    @@@                                                  
   @@@@                                                  
  @@@@@                                                  
 @@@@@@ */

import java.util.Scanner;

public class A626 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int num = input.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int s=1;s<num-i;s++)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print("@");
            System.out.println();
        }
        input.close();
    }
}
