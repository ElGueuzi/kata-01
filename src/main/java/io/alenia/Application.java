package io.alenia;

public class Application {

    public static void main(String[] args) {
        var bank = new Bank("Nice Bank");

        var client = new Client("client@test.com");

        bank.addClient(client);

        var account = new Account();

        client.addAccount(account);

        account.executeOperation(Operations.DEPOSIT, 10);
        account.executeOperation(Operations.DEPOSIT, 5);
        account.executeOperation(Operations.WITHDRAWAL, 8);
        account.executeOperation(Operations.WITHDRAWAL, 2);

        account.printTransactions();
    }
}
