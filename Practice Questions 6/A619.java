/*19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

       1
      2 2
     3 3 3
    4 4 4 4  */

public class A619 {
    public static void main(String[] args) {
        int row = 4;
        for(int i=1; i<=row;i++)
        {
            for(int s = row-i; s>0; s--)
                System.err.print(" ");
            for(int j=i;j>0;j--)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
