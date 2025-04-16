//2. Write a program to read gender(M/F) and print the corresponding gender using a switch statement

public class A512 {
    public static void main(String[] args) {
        char g = 'M';
        switch(g){
            case 'M': 
                System.out.println("Male");
                break;
            case 'F': 
                System.out.println("Female");
                break; 
            default:
                System.out.println("Other");
        }
    }
}
