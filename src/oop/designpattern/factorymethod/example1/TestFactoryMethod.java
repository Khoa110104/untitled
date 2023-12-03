package oop.designpattern.factorymethod.example1;

import java.util.Scanner;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Bank bank = BankFactory.getBank(type);
        System.out.println(bank.getBankName());
    }
}
