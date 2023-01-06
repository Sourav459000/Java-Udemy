public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)) {
            int count = 0;
            if(firstNumber % 10 == secondNumber % 10) {
                count++;
            }
            if(secondNumber % 10 == thirdNumber % 10) {
                count++;
            }
            if(thirdNumber % 10 == firstNumber % 10) {
                count++;
            }
            if(count >= 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }
}