import java.util.Scanner;

public class _6_swap_two_number_using_third_var {
    public static void main(String[] args) {
        // here we see the how to swap two number using 3rd variables

        // get two number from user
        int a ,b ,temp;
        //create the object of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number a ");
        a = input.nextInt();
        System.out.println("enter your second number b");
        b= input.nextInt();
        temp = a ;
        a = b ;
        b = temp;

        System.out.println("after swap both number a and b ");
        System.out.println("this is a : "+a+" \nthis is b "+b );

    }
}
