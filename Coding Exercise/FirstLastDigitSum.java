public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        else{
            int lastDigit = number % 10;
            int firstDigit = 0, lengthNumber = 0;
            int domyNumber = number;
            while (domyNumber != 0) {
                domyNumber /= 10;
                lengthNumber++;
            }
            for (int i = 0; i < lengthNumber - 1; i++) {
                number /= 10;
            }
            firstDigit = number;
            int sum = firstDigit + lastDigit;
            return sum;
        }
    }
}
