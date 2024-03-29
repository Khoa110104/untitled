package homework.homework1.BookStore;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;

    private BookManager panel;


    private int wallet;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.panel = new BookManager();
        this.wallet = 0;
    }

    public BookManager getPanel() {
        return panel;
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        if (this instanceof Admin) {
            this.username = username;
        } else {
            System.out.println("Bạn không đủ thẩm quyền");
        }
    }

    protected String getPassword() {
        if (this instanceof Admin) {
            return password;
        } else {
            System.out.println("Bạn không đủ thẩm quyền");
        }
        return null;
    }

    protected void setPassword(String password) {
        if (this instanceof Admin) {
            this.password = password;
        } else {
            System.out.println("Bạn không đủ thẩm quyền");
        }
    }

    public void buyBook(int index) {
        Book test = panel.getAllBook().get(index);
        if (wallet < test.getCost()) {
            System.out.println("=============O===========");
            System.out.println("Bạn không đủ tiền");
            System.out.println("=============O===========");
        } else {
            System.out.println("=============O===========");
            System.out.println("Mua sách thành công , bạn hãy kiểm tra tủ sách của bạn");
            System.out.println("=============O===========");
            wallet -= panel.getAllBook().get(index).getCost();
            panel.getListMyBook().add(panel.getAllBook().get(index));
        }
    }

    public int getWallet() {
        return wallet;
    }

    private void change(int wallet) {
        this.wallet = wallet;
    }

    public void setWallet(User user, int wallet) {
        if (this instanceof Admin) {
            user.change(wallet);
        } else {
            System.out.println("Bạn không đủ thẩm quyền");
        }
    }

    @Override
    public String toString() {
        return String.format("Username : %s , wallet : %d , Role : User", username, wallet);
    }

}
