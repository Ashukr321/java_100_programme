import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.util.Scanner;

public class _19_while_loop {
    public static void main(String[] args) {
        // while loop is the another type of the iteration in the java
        // while loop first check the condition then print the output

        // take the user input  int data and check enter user number is natural number or not

        // create the scanner class object
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number n ");
        int n ;
        while ((n= input.nextInt())!=0){
            if (n > 0) {

                System.out.println("enter your number is natural number  :"+n);

            }else {
                System.out.println("enter your number is not natural number  :"+n);

            }
        }

    }
}
