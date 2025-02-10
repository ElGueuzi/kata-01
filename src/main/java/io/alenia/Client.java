package io.alenia;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String email;

    private List<Account> accounts;

    public Client(String email) {
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
