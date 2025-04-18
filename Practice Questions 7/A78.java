//8) How to Compare Two Objects in Java

public class A78 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1==s2); //returns if the memory adresses are same (compares l value)
        System.out.println(s1.equals(s2));  //returns if the value is same (compares r value)
    }
}
