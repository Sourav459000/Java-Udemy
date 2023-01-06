public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
    public static boolean isOdd(int parameter) {
        if (parameter < 0) {
            return false;
        }
        else{
            if (parameter % 2 == 1) {
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start <= end) && (start > 0) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                }
            }
            return sum;
        }
        else{
            return -1;
        }
    }
}

