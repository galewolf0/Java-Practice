/*18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

The pattern like :

1
2 3
4 5 6
7 8 9 10  */


public class A618 {
    public static void main(String[] args) {
        int num = 1;
        for(int row = 1; num<=10; row++)
        {
            for(int col=1;col<=row; col++, num++)
            System.out.print(num + " ");
            System.out.println();
        }
    }
}
