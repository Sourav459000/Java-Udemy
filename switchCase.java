public class switchCase {
    // Traditional Switch Case
    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2: case 3:
                System.out.println("Value was " + value);
                break;
            default:
                System.out.println("Value is > than 3 or less than 1.");
                break;
        }
        EnhancedSwitchCase();
    }
    // Enhanced Switch Case
    public static void EnhancedSwitchCase() {
        int Evalue = 2;
        switch (Evalue) {
            case 1 -> System.out.println("Value was 1");
            case 2, 3 -> System.out.println("Value was " + Evalue);
            default -> System.out.println("Value is > than 3 or less than 1.");
        }
    }
}
