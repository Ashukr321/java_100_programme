import java.util.Scanner;

public class _22_while_loop_using_break_and_continue {
    static int n;
    public static void main(String[] args) {
        // here we see the while  loop
        // use of the break and continue;
        // create the scanner class obejects

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");
        while (true) {
            n = input.nextInt();
            if (n != 0) {
                System.out.println("enter your number is "+ n);

                continue;
            } else {
                break;
            }
        }
    }
}

