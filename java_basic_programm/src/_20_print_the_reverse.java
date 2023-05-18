import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class _20_print_the_reverse {
    public static void main(String[] args) {
        // print the reverse in order number;
        // number is taken by users

        // create the scanner class object
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number ");
        int num  =input.nextInt();
        int reverse =0; // this store the reverse number
        while (num!=0){
            reverse = reverse*10;
            reverse = reverse+num%10;
            num = num/10;
        }
        System.out.println("the reverse of your enter number :"+reverse);
    }
}
