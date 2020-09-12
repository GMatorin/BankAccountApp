package bankApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        String file = "/Users/glebchyk/Desktop/workspace/Back/Java/Udemy/Projects/src/bankApp/accounts.csv";
        List<String[]> newAccountHolders = bankApp.utilities.CSV.read(file);
        for(String[] newAccountHolder: newAccountHolders) {
            String name = newAccountHolder[0];
            String ssn = newAccountHolder[1];
            String accountType = newAccountHolder[2];
            double initDeposit = Double.parseDouble(newAccountHolder[3]);

            if(accountType.equals("Savings")) {
                accounts.add(new Savings(name, ssn, initDeposit));
            } else if(accountType.equals("Checking")) {
                accounts.add(new Checking(name, ssn, initDeposit));
            } else {
                System.out.println("Error opening the account");
            }
        }

        for(Account acc: accounts) {
            acc.showInfo();
        }
    }
}
