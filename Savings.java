package bankApp;

public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        this.accountNumber = setAccountNumber(AccountsIds.Savings);
        setSafetyDepositBox();
    }


    @Override
    public void setRate() {
        this.rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        this.safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        this.safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features" +
                "\n Safety deposit box id: " + this.safetyDepositBoxID  +
                "\n Safety deposit box key: " + this.safetyDepositBoxKey +
                "\n Rate: " + this.rate + "%");
    }
}
