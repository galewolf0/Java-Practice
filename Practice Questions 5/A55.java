//5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

//Test Data
//Input number: 3
//Expected Output :
//Wednesday

public class A55 {
    public static void main(String[] args){
        int day = 3;
        if(day == 1)
        System.out.println("Monday");
        else if(day == 2)
        System.out.println("Tuesday");
        else if(day == 3)
        System.out.println("Wednesday");
        else if(day == 4)
        System.out.println("Thursday");
        else if(day == 5)
        System.out.println("Friday");
        else if(day == 6)
        System.out.println("Saturday");
        else if(day == 7)
        System.out.println("Sunday");
        else
        System.out.println("Corresponding day does not exist");
    }
}
