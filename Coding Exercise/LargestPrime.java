public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number) {
       if (number <= 1) {
            return -1;
        }
        else{
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } 
                else{
                    number = number / largestPrime;
                    
                }
            }
            return number;
        }
    }
}
