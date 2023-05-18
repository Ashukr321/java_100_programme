import com.sun.security.jgss.GSSUtil;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class _18_printing_the_start_number_of_row_is_taken_from_user {
    public static void main(String[] args) {
        // create the object of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of the row");
        int row= input.nextInt();

        // outer loop for the number of the row iteration
        for (int i = 0 ; i<=row; i++){
            //inner loop
            for (int j = 0 ; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
