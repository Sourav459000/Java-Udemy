public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int numberCopy = number;
        int reverse = 0,lastDigit = 0;
        while (numberCopy > 0) {
            lastDigit = numberCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numberCopy /= 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

}