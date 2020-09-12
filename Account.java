package bankApp;

public abstract class Account implements IBaseRate {
    private String name;
    private String ssn;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    public Account(String name) {
        this.name = name;
        this.index++;
    }

    public Account(String name, String ssn, double initDeposit) {
        this(name);
        this.ssn = ssn;
        this.balance = initDeposit;
        this.setRate();
    }

    public abstract void setRate();

    public void deposit(double amount) {
        this.balance = balance + amount;
        System.out.println("Depositing $" + amount);
    }

    public void withdraw(double amount) {
        this.balance = balance - amount;
        System.out.println("Withdraw $" + amount);
    }

    public void transfer(String toWhere, double amount) {
        this.balance = this.balance - amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
    }

    public void printBalance() {
        System.out.println("Your current balance is $" + this.balance);
    }

    public void compound() {
        double accruedInterest = this.balance * (rate/100);
        this.balance = this.balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        this.printBalance();
    }

    protected String setAccountNumber(AccountsIds account) {
        String lastTwoSsn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return  account.getValue() + lastTwoSsn + uniqueID + randomNumber;
    }

    public void showInfo() {
        System.out.println("Name: " + this.name +
                "\n Account number: " + this.accountNumber +
                "\nBalance: " + balance);
    }
}
