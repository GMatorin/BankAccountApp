package bankApp;

public enum AccountsIds {
    Savings(1),
    Checking(2);

    private int value;

    private AccountsIds(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
