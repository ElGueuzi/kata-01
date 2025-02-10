package io.alenia;

import java.time.LocalDateTime;

public class Withdrawal implements Operation {

    @Override
    public Transaction execute(double amount, double currentBalance) {
        if (amount < 0 || amount > currentBalance) {
            throw new BankException("bad amount");
        }
        var newBalance = currentBalance - amount;
        return new Transaction(LocalDateTime.now(), "Withdrawal", -amount, newBalance);
    }
}
