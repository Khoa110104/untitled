package oop.homework.homework1.BookStore;

import homework.homework1.BookStore.User;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public String toString() {
        return String.format("Username : %s , wallet : %d , Role : Admin", super.getUsername(), super.getWallet());
    }
}
