//10. Write a program to find the Maximum of Two Numbers using switch statement

public class A520 {
    public static void main(String[] args) {
        int a = 23, b = 24;
        switch((a>=b)?1:0){
            case 1:
                switch((a>b)?1:0) {
                    case 1:
                    System.out.println(a + " is greater");
                        break;
                    case 0:
                    System.out.println(a + " and " + b + " are same");
                    break;
                }
                break;
            case 0:
                System.out.println(b + " is greater");
                break;
        }
    }
}
