import java.util.Scanner;
import java.text.NumberFormat;

public class TestScoreApp {

    public static void main(String[] args) {
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();

        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

        while (testScore != 999) {
            System.out.print("Enter score: ");
            testScore = Integer.parseInt(sc.nextLine());

            if (testScore >= 0 && testScore <= 100) {
                scoreCount++;
                scoreTotal += testScore;
            } else if (testScore != 999) {
                System.out.println("Invalid entry; not counted");
            }
        }

        double averageScore = 0.0;
        if (scoreCount > 0) {
            averageScore = (double) scoreTotal / scoreCount;
            averageScore = Math.round(averageScore * 100.0) / 100.0;
        }

        System.out.println();
        System.out.printf("%-15s %d%n", "Score count:", scoreCount);
        System.out.printf("%-15s %d%n", "Score total:", scoreTotal);
        
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        number.setMinimumFractionDigits(2);
        System.out.printf("%-15s %s%n", "Average score:", number.format(averageScore));
        
        sc.close();
    }
}