package oop.lab.lab5.ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(11, "Tan Ah Teck", 'm');
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getID());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        Account account1 = new Account(1357, customer1, 22);
        System.out.println(account1);
        System.out.println("id is: " + account1.getID());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is : " + account1.getBalance());
        System.out.println("depositing: " + account1.deposit(10));
        System.out.println("withdraw: " + account1.withdraw(100));
    }
}
