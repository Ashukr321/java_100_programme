import java.util.Scanner;

public class _4_get_user_input {
    public static void main(String[] args) {
        // here we get the user input
        // to get the user input in the java
        // we have to use the scanner class object to get the input

        int a ; String name;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");
        a = input.nextInt();
        System.out.println("enter your name ");
        name = input.next();
        System.out.println("your name is  " +name+" and your enter number is "+a);
    }
}
