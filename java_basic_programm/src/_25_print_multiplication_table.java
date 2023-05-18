import java.util.Scanner;

public class _25_print_multiplication_table {
    public static void main(String[] args) {
        int n ;
        // scanner  class object
        Scanner input = new Scanner(System.in);
        System.out.println("enter table number that you want");
        n = input.nextInt();
        for (int i =1 ; i<=10; i++){
            System.out.println(i+"*"+n+" = "+i*n);
        }
        System.out.println();
    }
}
