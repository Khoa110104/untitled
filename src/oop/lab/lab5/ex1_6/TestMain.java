package oop.lab.lab5.ex1_6;

public class TestMain {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString()
        Account account1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(account1);
        Account account2 = new Account("A102", "Kumar");
        System.out.println(account2);

        //BasicStatistics Getter
        System.out.println("ID: " + account1.getID());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        //BasicStatistics credit() and debit()
        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500);
        System.out.println(account1);

        //BasicStatistics transfer
        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println();
    }

}
