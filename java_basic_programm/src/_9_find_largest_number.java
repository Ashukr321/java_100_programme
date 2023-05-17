import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class _9_find_largest_number {
    public static void main(String[] args) {
//        finding the max element among three element in the java
        //create the scanner class to get the user input
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.println("enter  the value of x");
        x = input.nextInt();
        System.out.println("enter the value of y");
        y = input.nextInt();
        System.out.println("enter the value of z");
        z = input.nextInt();

        // here apply logic to get the max element among given number
        if (x > y && x > z) {
            System.out.println(x + " is greater among given number ");
        } else if (y > x && y > z) {
            System.out.println(y + " is greater among given number ");

        } else if (z > x && z > y) {
            System.out.println(z + " is greater among given number ");

        } else {
            System.out.println("invalid input 😎");
        }
    }
}
