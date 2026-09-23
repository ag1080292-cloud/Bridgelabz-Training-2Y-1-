package Arrays.Level2;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int students = 5;
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();
        }

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = total / 3.0;

            char grade;

            if (percentage >= 90)
                grade = 'A';
            else if (percentage >= 75)
                grade = 'B';
            else if (percentage >= 50)
                grade = 'C';
            else
                grade = 'D';

            System.out.println("Student " + (i + 1)
                    + " Percentage = " + percentage
                    + " Grade = " + grade);
        }

        input.close();
    }
}
