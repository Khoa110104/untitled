package oop.lab.lab11.command.example;

public class TestMain {

    public static void main(String[] args) {
        Account account = new Account("khoa khoa");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        System.out.println("****************************");
        bankApp.clickCloseAccount();
    }
}