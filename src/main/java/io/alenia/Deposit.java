package io.alenia;

import java.time.LocalDateTime;

public class Deposit implements Operation {

    @Override
    public Transaction execute(double amount, double currentBalance) {
        if (amount < 0) {
            throw new BankException("bad amount");
        }
        var newBalance = currentBalance + amount;
        return new Transaction(LocalDateTime.now(), "Deposit", amount, newBalance);
    }
}
