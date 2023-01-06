public class challengeMethodOverloading {
    public static void main(String[] args) {
        System.out.println("5 foot 6 inches = " + (float)convertToCentimeters(5, 6) + " cm");
    }
    public static double convertToCentimeters(int inches) {
        return (double)(inches*2.54);
    }
    public static double convertToCentimeters(int foot, int inches) {
        return convertToCentimeters((foot*12)+inches);
    }
}
