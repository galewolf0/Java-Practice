/*23. Write a Java program to generate the following * triangles.

Test Data
Input the number: 5
Expected Output :

*
**
***
****
***** */

public class A625 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++)
        {
        for(int j=1;j<=i;j++)
        System.out.print("*");
        System.out.println();
        }
    }
}
