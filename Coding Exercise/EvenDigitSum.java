public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        else{
            int domyNumber = number, sumEven = 0, lengthNumber = 0, flag;
            while (domyNumber != 0) {
                domyNumber /= 10;
                lengthNumber++;
            }
            for (int i = 0; i < lengthNumber; i++) {
                flag = number % 10;
                if (flag % 2 == 0) {
                    sumEven += flag;
                }
                number = number / 10;
            }
            return sumEven;
        }

    }
}
