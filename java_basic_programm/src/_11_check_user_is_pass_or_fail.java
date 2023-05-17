import java.util.Scanner;

public class _11_check_user_is_pass_or_fail {
    public static void main(String[] args) {
        // check user is pass or failed
        int marksObtained, passingMarks;
        // scanner class object
        Scanner input = new Scanner(System.in);

        passingMarks = 40;
        System.out.println("enter your marks");

        marksObtained =input.nextInt();
        if (marksObtained > passingMarks) {
            System.out.println("congratulations you are pass 😎");

        } else {
            System.out.println("you are failed 😔 better luck next time ");

        }

    }
}
