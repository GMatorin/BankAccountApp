package bankApp;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        this.accountNumber = setAccountNumber(AccountsIds.Checking);
        this.setDebitCard();
    }

    @Override
    public void setRate() {
        this.rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        this.debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        this.debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features: " +
                "\n Debit Card Number: " + this.debitCardNumber +
                "\n Debit Card Pin: " + this.debitCardPin +
                "\n Rate: " + this.rate + "%");
    }
}
