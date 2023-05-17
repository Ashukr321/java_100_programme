import java.util.Scanner;

public class _5_how_to_convert_fahrenheit_to_celsius {
    public static void main(String[] args) {
        // here we see the how to convert the f to c
        float temperature ;

        //create the scanner class object
        Scanner input = new Scanner(System.in);
        System.out.println("enter f data");
        int f = input.nextInt();

        temperature= ((f-31)*5)/9;
        System.out.println("the temperature in celsius is : "+temperature);
    }
}
