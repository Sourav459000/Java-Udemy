import java.util.Scanner;

public class challengeBankClass {
    private String accountNumber;
    private double accountBalance = 100000;
    private String customerName;
    private String email;
    private int phoneNumber;
    Scanner scanner = new Scanner(System.in);

    // public challengeBankClass() {
    //     System.out.println("Empty constructor called");
    // }

    // public challengeBankClass(int phoneNumber, String accountNumber, double accountBalance, String customerName, String email) {
    //     System.out.println("challengeBankClass constructor with parameters called");
    //     this.accountNumber = accountNumber;
    //     this.accountBalance = accountBalance;
    //     this.customerName = customerName;
    //     this.email = email;
    //     this.phoneNumber = phoneNumber;
    // }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void cashWithdrawal() {
        System.out.println("Enter the amount you want to withdrawal: ");
        String withdrawalAmountsString = scanner.nextLine();
        double withdrawalAmount = Double.parseDouble(withdrawalAmountsString);
        if (withdrawalAmount < 0) {
            System.out.println("Invalid Value.");
        }
        else {
            if (withdrawalAmount > accountBalance) {
                System.out.println("Transaction not possible. Insufficient balance.");
                System.out.println("Your Account Balance: " + accountBalance);
            }
            else {
                System.out.println("The amount you entered is: " + withdrawalAmount);
                accountBalance  -= withdrawalAmount;
                System.out.println("Transaction successful. Remaining Account Balance: " + accountBalance);
            }
        }
    }
    public void cashDeposit() {
        System.out.println("Enter the amount you want to deposit: ");
        String depositAmountsString = scanner.nextLine();
        double depositAmount = Double.parseDouble(depositAmountsString);
        if (depositAmount < 0) {
            System.out.println("Invalid Value.");
        }
        else {
            System.out.println("The amount you deposited is: " + depositAmount);
            accountBalance += depositAmount;
            System.out.println("Transaction successful. New Account Balance: " + accountBalance);
        }
    }
}
