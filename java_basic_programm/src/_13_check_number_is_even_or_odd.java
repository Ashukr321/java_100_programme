import java.util.Scanner;

public class _13_check_number_is_even_or_odd {
    public static void main(String[] args) {
        // create the scanner class object
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter the value of the num");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("enter your number is even number  : " + num);

        } else {
            System.out.println("enter your number is odd number : " + num);
        }
    }
}
