//7. Write a Java program to find the number of days in a month.

//Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days

public class A57 {
    public static void main(String[] args){
        int month = 2;
        int year = 2016;
        if(month>12 || month<1)
        System.out.println("Month does not exist");
        else if(month == 1)
        System.out.println("January " + year + " has 31 days");
        else if(month == 2)
        {
            if(year%4==0)
            System.out.println("February " + year + " has 29 days");
            else
            System.out.println("February " + year + " has 28 days");
        }
        else if(month == 3)
        System.out.println("March " + year + " has 31 days");
        else if(month == 4)
        System.out.println("April " + year + " has 30 days");
        else if(month == 1)
        System.out.println("May " + year + " has 31 days");
        else if(month == 1)
        System.out.println("June " + year + " has 30 days");
        else if(month == 1)
        System.out.println("July " + year + " has 31 days");
        else if(month == 1)
        System.out.println("August " + year + " has 31 days");
        else if(month == 1)
        System.out.println("September " + year + " has 30 days");
        else if(month == 1)
        System.out.println("October " + year + " has 31 days");
        else if(month == 1)
        System.out.println("November " + year + " has 30 days");
        else if(month == 1)
        System.out.println("December " + year + " has 31 days");
    }
}
