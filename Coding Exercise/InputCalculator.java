import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        int sum = 0, avg = 0, number, loopCount = 1;
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    number = scanner.nextInt();
                    sum += number;
                    avg = (int) Math.round((double)sum / loopCount);
                    loopCount++;
                }
            }
            
        } catch (InputMismatchException e) {
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }
    }
}
