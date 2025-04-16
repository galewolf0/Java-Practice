//3. Write a program to Check whether a character is a vowel or consonant using switch statement

public class A513 {
    public static void main(String[] args) {
        char ch = 's';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
        
            default:
                System.out.println("Consonent");
        }
    }
}
