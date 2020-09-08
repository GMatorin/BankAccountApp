package bankApp;

public abstract class Account implements IBaseRate {
    String name;
    String ssn;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    public Account(String name) {
        this.name = name;

        this.index++;
    }

    public Account(String name, String ssn, double initDeposit) {
        this(name);
        this.ssn = ssn;
        this.balance = initDeposit;
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
