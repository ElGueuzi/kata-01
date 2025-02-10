package io.alenia;

import java.time.LocalDateTime;

public class Deposit implements Operation {

    private final double amount;

    public Deposit(double amount) {
        this.amount = amount;
    }

    @Override
    public Transaction execute(double currentBalance) {
        if (amount < 0) {
            throw new BankException("bad amount");
        }
        var newBalance = currentBalance + amount;
        return new Transaction(LocalDateTime.now(), "Deposit", amount, newBalance);
    }
}
