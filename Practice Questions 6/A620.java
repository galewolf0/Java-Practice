/*20. Write a Java program to print Floyd's Triangle.

Test Data
Input number of rows : 5
Expected Output :

Input number of rows :  5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15  */

public class A620 {
    public static void main(String[] args) {
        int num = 1;
        for(int row = 1; num<=15; row++)
        {
            for(int col=1;col<=row; col++, num++)
            System.out.print(num + " ");
            System.out.println();
        }
    }
}

