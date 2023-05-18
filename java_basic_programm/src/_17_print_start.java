public class _17_print_start {
    public static void main(String[] args) {
        // outer loop for the number of the row
        for (int i = 0 ; i<=10; i++){
            // inner loop to print the number of start
            for (int j = 0 ; j<=i; j++){
                System.out.print("*");
            }
            // add new line
            System.out.println();
        }
    }
}
