public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this ("12345", 500, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty Constructor called.");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String email,
                   String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" +
                accountBalance);
    }

    public void withdrawFund(double withdrawAmount) {
        if (withdrawAmount > accountBalance) {
            System.out.println("Insufficient funds, withdrawal amount of " + withdrawAmount +
                    " is greater than remaining balance of " + accountBalance);
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount +
                    " processed, Remaining balance = $" + accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
