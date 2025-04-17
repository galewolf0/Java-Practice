/*23. Write a Java program to generate the following * triangles.

Test Data
Input the number: 6
Expected Output :

******                                                   
 *****                                                   
  ****                                                   
   ***                                                   
    **                                                   
     * 
*/

import java.util.Scanner;

public class A624 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int num = input.nextInt();
        for(int i = 0; i<num;i++)
        {
            for(int s=0; s<i; s++)
                System.out.print(" ");
        
            for(int j=0;j<num-i;j++)
                System.out.print("*");
            System.out.println();
            input.close();
        }
}
}
