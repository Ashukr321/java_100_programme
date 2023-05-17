import java.util.Scanner;

public class _8_add_two_integer_number {
    public static void main(String[] args) {
        //create scanner class object
        Scanner input = new Scanner(System.in);
        int a, b, sum;
        System.out.println("enter your first number a ");
        a = input.nextInt();
        System.out.println("enter your 2nd number b ");
        b   = input.nextInt();
        sum = a+b;
        System.out.println("the sum of the number a and b is :"+sum);
    }
}
