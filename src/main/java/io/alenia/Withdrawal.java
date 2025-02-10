package io.alenia;

import java.time.LocalDateTime;

public class Withdrawal implements Operation {

    private final double amount;

    public Withdrawal(double amount) {
        this.amount = amount;
    }

    @Override
    public Transaction execute(double currentBalance) {
        if (amount < 0 || amount > currentBalance) {
            throw new BankException("bad amount");
        }
        var newBalance = currentBalance - amount;
        return new Transaction(LocalDateTime.now(), "Withdrawal", -amount, newBalance);
    }
}
