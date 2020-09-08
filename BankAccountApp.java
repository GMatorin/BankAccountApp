package bankApp;

public class BankAccountApp {
    public static void main(String[] args) {
        Checking check1 = new Checking("John Doe", "123123", 1500);
        Savings save1 = new Savings("Doe John", "456456", 2500);

        save1.showInfo();
    }
}
