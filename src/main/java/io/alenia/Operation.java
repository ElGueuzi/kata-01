package io.alenia;

public interface Operation {

    Transaction execute(double currentBalance);
}
