public class challengeSum3and5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 ==0)) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("The sum of first 5 digits between 1 to 1000 that are divisible by both 3 and 5 is: " + sum);
    }
}
