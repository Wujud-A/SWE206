import java.util.Scanner;
public class GPACalc {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many courses?");
        int course = input.nextInt();
        double gradeVal = 0d;
        int credits = 0;
        double total = 0d;

        for (int courses=1; courses<= course;courses++){
            System.out.println("Enter letter grade, credit hours for course "+courses);
            String grade=input.next();
            int hours= input.nextInt();

            switch (grade) {
                case "A+":
                    gradeVal = 4.0;
                    break;

                case "A":
                    gradeVal = 3.75;
                    break;

                case "B+":
                    gradeVal = 3.5;
                    break;

                case "B":
                    gradeVal = 3.0;
                    break;

                case "C+":
                    gradeVal = 2.5;
                    break;

                case "C":
                    gradeVal = 2.0;
                    break;

                case "D+":
                    gradeVal = 1.5;
                    break;

                case "D":
                    gradeVal = 1.0;
                    break;

                case "F":
                    gradeVal = 0.0;
                    break;
            }
            total += gradeVal*hours;
            credits += hours;
        }
        double gpa= total/credits;
        System.out.println("GPA= "+ gpa);
    }
}
