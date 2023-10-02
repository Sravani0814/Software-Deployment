
// Author: Sravani
import java.util.Scanner;

public class LetterGrade {

    public static void main(String[] args) {
        String letterGrade;

        System.out.println(" Please enter your grade: ");

        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();

        if (grade >= 95) {
            letterGrade = "A+";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else if (grade >= 90) {
            letterGrade = "A";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else if (grade >= 85) {
            letterGrade = "B+";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else if (grade >= 80) {
            letterGrade = "B";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else if (grade >= 75) {
            letterGrade = "C+";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else if (grade >= 70) {
            letterGrade = "C";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else if (grade >= 65) {
            letterGrade = "D+";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else if (grade >= 60) {
            letterGrade = "D";

            System.out.println(" your test grade is:" + letterGrade);
        }

        else {
            System.out.println(" Set the letterGrade to F");
        }

    }
}