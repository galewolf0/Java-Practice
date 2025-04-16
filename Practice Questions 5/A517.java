//7. Write a program to print remark according to the grade obtained using switch statement

public class A517 {
    public static void main(String[] args) {
        char g = 'B';
        switch (g) {
            case 'A':
            case 'a':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'b':
                System.out.println("Very good!");
                break;
            case 'C':
            case 'c':
                System.out.println("Good.");
                break;
            case 'D':
            case 'd':
                System.out.println("You passed.");
                break;
            case 'E':
            case 'e':
                System.out.println("Needs improvement.");
                break;
            case 'F':
            case 'f':
                System.out.println("Fail.");
                break;
            default:
                System.out.println("Error: Grade does not exist");
    }
}
}