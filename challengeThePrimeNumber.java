public class challengeThePrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i) == true) {
                if (count == 3) {
                    System.out.println("Found first 3 prime nummbers between 10 and 50 - Exiting for loop");
                    break;
                }
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
        }
    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber < 2) {
            return false;
        }
        else if (wholeNumber == 2) {
            return true;
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static void name() {
        
    }
}
