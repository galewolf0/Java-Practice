//2. Write a Java program to solve quadratic equations (use if, else if and else).

//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
//Expected Output :
//The roots are -0.20871215252208009 and -4.7912878474779195

public class A52 {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 1;
        double d = (b * b) - (4 * a * c);
        if(d>0)
        {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } 
        else if(d==0)
        {
            double r = -b / (2 * 1);
            System.out.println("The roots is " + r);
        }
        else
        {
            double real = -b / (2 * 1);
            double img = Math.sqrt(-d) / (2 * a);
            System.out.println("The roots are " + real + " + " + img + "i and " + real + " - " + img + "i");
        }
    }
}
