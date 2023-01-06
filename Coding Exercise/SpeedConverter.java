public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else{
            double MilesPerHour = Math.round(kilometersPerHour / 1.609d);
            return (long) MilesPerHour;
        }
    }
    public static void printConversion(double kilometersPerHour) {
        long variable = toMilesPerHour(kilometersPerHour);
        if (variable == -1) {
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + variable + "mi/h");
        }
    }    
}
