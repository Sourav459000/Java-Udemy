public class challengeConstructorMain {
    public static void main(String[] args) {
        challengeConstructor firstCustomer = new challengeConstructor("Sourav", 100000.00, "sourav280902@gmail.com");
        challengeConstructor secondCustomer = new challengeConstructor();
        challengeConstructor thirdCustomer = new challengeConstructor("Gayatri", "gtwal11@gmail.com");
        
        System.out.println(firstCustomer.getName());
        System.out.println(firstCustomer.getCreditLimit());
        System.out.println(firstCustomer.getEmailAddress());

        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());
        
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
    }
}
