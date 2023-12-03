package oop.lab.lab11.command.example;

public class OpenAccount implements Command {

    private Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}