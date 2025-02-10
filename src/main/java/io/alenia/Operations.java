package io.alenia;

public class Operations {

    public static final Operation DEPOSIT = new Deposit();
    public static final Operation WITHDRAWAL = new Withdrawal();

    private Operations() {
        super();
    }
}
