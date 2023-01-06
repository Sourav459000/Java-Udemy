public class challengeConstructor {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public challengeConstructor(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public challengeConstructor(){
        this("Gaurav", "rohitian45t@gmail.com");
    }
    public challengeConstructor(String name, String emailAddress){
        this(name, 1000, emailAddress);
    }
}
