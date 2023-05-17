import java.util.Scanner;

public class _12_gives_the_grade_of_student_according_their_marks_obtained {
    public static void main(String[] args) {

        // create the object of the scanner class
        Scanner input = new Scanner(System.in);
        int obtainedMarks, passingMarks = 40;
        System.out.println("enter your marks ");

        obtainedMarks = input.nextInt();
        // here we use the nested if condition
        if (obtainedMarks >= passingMarks) {
            if (obtainedMarks > 90) {
                System.out.println('A');
            } else if (obtainedMarks > 80) {
                System.out.println('B');
            } else if (obtainedMarks > 70) {
                System.out.println('C');
            } else if (obtainedMarks > 60) {
                System.out.println('D');
            } else if (obtainedMarks > 50) {
                System.out.println('E');
            } else if (obtainedMarks >= 40) {
                System.out.println("F");
            }
        }
    }
}
