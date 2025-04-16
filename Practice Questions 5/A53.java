//3. Write a Java program that takes three numbers from the user and prints the greatest number.

//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87

public class A53 {
    public static void main(String[] args) {
        int a = 25, b = 78, c = 87;
        if(a>b && a>c)
        System.out.println("The greatest: " + a);
        else if(b>a && b>c)
        System.out.println("The greatest: " + b);
        else
        System.out.println("The greatest: " + c);
    }
}
