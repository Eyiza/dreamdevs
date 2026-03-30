package bankApp;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts;
    private int accountNumber = 1;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void createAccount(String accountName, String accountPin) {
        Account newAccount = new Account(accountName, accountPin);
        accounts.add(newAccount);
    }
}
