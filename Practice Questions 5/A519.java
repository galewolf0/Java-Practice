//9. Write a program to check whether a person is eligible to vote or Not using switch statement

public class A519 {
    public static void main(String[] args) {
        int age = 23;
        switch((age > 17)?1:0){
            case 1:
                System.out.println("Person is eligible to vote.");
                break;
            case 0:
                System.out.println("Person is NOT eligible to vote.");
                break;
        }
    }
}
