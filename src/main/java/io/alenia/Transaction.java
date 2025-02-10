package io.alenia;

import java.time.LocalDateTime;

public class Transaction {

    private final LocalDateTime date;

    private final String type;

    private final double amount;

    private final double balance;

    public Transaction(LocalDateTime date, String type, double amount, double balance) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return date + " | " + type + " | " + amount + " | " + balance;
    }
}
