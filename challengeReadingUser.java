import java.util.Scanner;

public class challengeReadingUser {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 1;
            int sum = 0;
            while (count <= 5) {
                System.out.println("Enter number #" + count + ":");
                String nextNumber= scanner.nextLine();
                try {
                    int number = Integer.parseInt(nextNumber);
                    count++;
                    sum += number;
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid number");
                }
            }
            System.out.println("The sum of the numbers = " + sum);
        }
    }
}
