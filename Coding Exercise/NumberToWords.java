public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1450);
    }
    public static int getDigitCount(int number) {
        if(number > 0){
            int lengthNumber = 0;
            while (number != 0) {
            number /= 10;
            lengthNumber++;
            }
            return lengthNumber;
       }
       else if(number == 0){
            return 1;
       }
       return -1;
    }
    public static int reverse(int number) {
        int remainder,reverseNumber = 0;
        boolean isNegative = false;
        if (number < 0) {
            number = Math.abs (number);
            isNegative = true;
        }
        while (number > 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        if (isNegative == true) {
            return -reverseNumber;
        }
        return reverseNumber;
    }
    public static void numberToWords(int number) {
        int number1 = reverse(number), extra = reverse(number);
        String numtoword = "";
        if (number == 0) {
            System.out.println("Zero");
        }
        if (number1 < 0) {
            System.out.println("Invalid Value");
        }
        else{
            int domyNumber = number1, lengthNumber = 0, flag;
            while (domyNumber != 0) {
                domyNumber /= 10;
                lengthNumber++;
            }
            for (int i = 0; i < lengthNumber; i++) {
                flag = number1 % 10;
                switch (flag) {
                    case 0:
                    numtoword += "Zero ";
                    break;
                    case 1:
                    numtoword += "One ";
                    break;
                    case 2:
                    numtoword += "Two ";
                    break;
                    case 3:
                    numtoword += "Three ";
                    break;
                    case 4:
                    numtoword += "Four ";
                    break;
                    case 5:
                    numtoword += "Five ";
                    break;
                    case 6:
                    numtoword += "Six ";
                    break;
                    case 7:
                    numtoword += "Seven ";
                    break;
                    case 8:
                    numtoword += "Eight ";
                    break;
                    case 9:
                        numtoword += "Nine ";
                        break;
                        default:
                        break;
                    }
                    number1 = number1 / 10;
                }
            }
            
            if (getDigitCount(extra) != getDigitCount(number)){
                int diff = getDigitCount(number) - getDigitCount(extra);
                for (int i = 0; i < diff; i++) {
                    numtoword += "Zero ";
                }
            }
            System.out.println(numtoword);
        }
    }
    