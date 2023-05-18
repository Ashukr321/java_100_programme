import java.util.Scanner;

public class _21_while_loop_using_break {

   static int n ;
    public static void main(String[] args) {
        // here we see the while loop using break

        //create the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");

        while (true){
            n = input.nextInt();
            if (n==0){

                break;
            }
            System.out.println("your enter number is "+ n);
        }

    }
}
