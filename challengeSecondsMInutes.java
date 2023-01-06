public class challengeSecondsMInutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3759));
    }
    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int remainder = seconds % 60;
        return getDurationString(minutes, remainder);
    }
    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        return (hours + "h " + minutes%60 + "m " + seconds + "s");
    }
}
