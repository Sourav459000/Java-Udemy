public class challengeDigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(1));
    }
    public static int sumDigits(int number) {
        if(number < 0){
            return -1;
        }
        else{
            int sum = 0;
            while (number > 9) {
                sum += number % 10;
                number /= 10;
            }
            sum += number;
            return sum;
        }
    }
}
