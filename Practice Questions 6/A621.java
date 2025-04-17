/*21. Write a Java program to display the pattern like a diamond.

Test Data
Input number of rows (half of the diamond) : 7
Expected Output :

                                                                                 
      *                                                                          
     ***                                                                         
    *****                                                                        
   *******                                                                       
  *********                                                                      
 ***********                                                                     
*************                                                                    
 ***********                                                                     
  *********                                                                      
   *******                                                                       
    *****                                                                        
     ***                                                                         
      *                     
  */

public class A621 {
    public static void main(String[] args) {
        int num = 7, row = 1;
        int s = num;
        for(int i=0; i<num ;i++)
        {
            for(int k=0; k<s;k++)
                System.out.print(" ");
            for(int j=1;j<=row+i;j++)
                System.out.print("*");
            System.out.println();
            row++;
            s--;
        }
        row--;
        s=1;
        for(int i = num-1; i>=0; i--)
        {
            for(int k=0; k<s;k++)
                System.out.print(" ");
            for(int j=row+i;j>0;j--)
                System.out.print("*");
            System.out.println();
            row--;
            s++;
        }
    }
}
