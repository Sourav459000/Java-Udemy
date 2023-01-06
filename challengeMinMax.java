import java.util.InputMismatchException;
import java.util.Scanner;

public class challengeMinMax {
    public static int min = 0;
    public static int max = 0;
    public static void main(String[] args) {
    int loopCount = 0;
    try {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter the number, or ay character to exit: ");
                int number = scanner.nextInt();
                if (loopCount == 0 || number < min) {
                    min = number;
                }
                if (loopCount == 0 || number > max) {
                    max = number;
                }
                loopCount++;
            }
        }    
     } catch (InputMismatchException nfe) {
    }
    if (loopCount > 0) {
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);   
    }
    else{
        System.out.println("No valid data entered");
    }   
    }
}
