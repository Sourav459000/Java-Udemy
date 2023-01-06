public class challengeisEvenNumber {
    public static void main(String[] args) {
        int number = 5;
        int evenCount = 0;
        int oddCount = 0;
        while (number <= 20) {
            if (isEvenNumber(number) == true && evenCount<5) {
                System.out.println("Even number " + number);
                evenCount++;
            }
            else{
                if (evenCount < 5) {
                    oddCount++;
                }
            }
            number++;
        }
        System.out.println("Total number of even numbers is " + evenCount + " while odd numbers is " + oddCount);

    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
