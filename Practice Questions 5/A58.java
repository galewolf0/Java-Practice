//8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

//Test Data
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant

public class A58 {
    public static void main(String[] args) {
        String ch="p";
        if(ch.length() > 1)
        System.out.println("Error: Multiple inputs were given.");
        else if(ch == "a" || ch=="e" || ch=="i" || ch=="o" || ch=="u" || ch == "A" || ch=="E" || ch=="I" || ch=="O" || ch=="U")
        System.out.println("Input letter is Vowel");
        else
        System.out.println("Input letter is Consonant");
    }
}
