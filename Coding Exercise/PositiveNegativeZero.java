import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num;
        try (Scanner s = new Scanner(System.in)) {
            num = s.nextInt();
        }
        name(num);
    }
    public static void name(int num) {
        if (num > 0) {
            System.out.println(num + " is positive integer.");
        }
        else if (num < 0) {
            System.out.println(num + " is negative integer.");
        }
        else{
            System.out.println(num + " is zero.");
        }
    }
}
