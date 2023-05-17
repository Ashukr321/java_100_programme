public class _2_print_integer_in_java {
    public static void main(String[] args) {
        int sum = 0;
        // print the integer number by for loop
        for (int i = 1; i <= 10; i++) {

            sum += i;
            System.out.println(i);
        }
        System.out.println("the sum  of the number from 1 to :)  " + sum);
    }
}
