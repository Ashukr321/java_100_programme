import java.util.Scanner;

public class _7_swap_two_number_without_using_third_var {
    public static void main(String[] args) {
        // here we see the how to swap two number without using 3rd variables
        int x , y ;
        // create the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number x");
        x= input.nextInt() ;
        y = input.nextInt();

        System.out.println("before swaping");
        System.out.println(x +" "+y);


        //swap logic
        x = x+y;
        y = x-y;
        x= x-y;
        System.out.println("after swap");
        System.out.println(x +" "+y);
    }
}
