package io.alenia;

public class Application {

    public static void main(String[] args) {
        var bank = new Bank("Nice Bank");

        var client = new Client("client@test.com");

        bank.addClient(client);

        var account = new Account();

        client.addAccount(account);

        account.executeOperation(new Deposit(10));
        account.executeOperation(new Deposit(5));
        account.executeOperation(new Withdrawal(8));
        account.executeOperation(new Withdrawal(2));

        account.printTransactions();
    }
}
