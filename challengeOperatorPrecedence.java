public class challengeOperatorPrecedence 
{
    public static void main(String[] args) 
    {
        double firstVariable = 20.00d, secondVariable = 80.00d;
        double result = (firstVariable + secondVariable) * 100d;
        double mod = result % 40.00d;
        boolean is0;
        if (mod == 0.00) 
        {
            is0 = true;
        }
        else
        {
            is0 = false;
            System.out.println("Got some reaminder: "+mod );
        }
        System.out.println("The output of boolean variable is: "+ is0);

    }
}
