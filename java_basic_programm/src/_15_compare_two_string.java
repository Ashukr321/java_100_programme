import java.util.Scanner;

public class _15_compare_two_string {
    public static void main(String[] args) {
        // create the object of the class
        Scanner input = new Scanner(System.in);
        String s1 , s2 ;
        System.out.println("enter your first string s1 ");
        s1 = input.nextLine();
        System.out.println("enter your 2nd string s2 ");
        s2 = input.nextLine();


        //here we use a string methods that is compare to
        System.out.println(s1.compareTo(s2));

    }
}
