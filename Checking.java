package bankApp;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        this.accountNumber = setAccountNumber(AccountsIds.Checking);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Checking Account");
    }
}
