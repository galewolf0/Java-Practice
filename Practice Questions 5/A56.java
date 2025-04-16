//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different

public class A56 {
    public static void main(String[] args) {
        double n1 = 25.586;
        double n2 = 25.589;
        if(n1==n2)
        System.out.println("They are same");
        else
        System.out.println("They are different");
    }
}
