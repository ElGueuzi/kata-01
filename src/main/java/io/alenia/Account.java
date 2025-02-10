package io.alenia;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private double balance;

    private final List<Transaction> transactions;

    public Account() {
        this.balance = 0.0d;
        this.transactions = new ArrayList<>();
    }

    public void executeOperation(Operation operation) {
        var transaction = operation.execute(balance);
        balance = transaction.getBalance();
        transactions.add(transaction);
    }

    public void printTransactions() {
        System.out.println("current balance : " + balance);
        System.out.println("Date  |  Type  |  Amount  |  Balance");
        transactions.forEach(System.out::println);
    }
}
