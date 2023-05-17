import javax.swing.*;
import java.util.Scanner;

public class _14_factorial_of_number {
    public static void main(String[] args) {
        // find the factorial of the number
        //create the object of the class
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int n = input.nextInt();
        int fact = 1;
        for (int c = 1; c<=n;c++){
                fact =+ fact*c;

        }
        System.out.println("the factorial of the your number is : " + fact);

    }
}
