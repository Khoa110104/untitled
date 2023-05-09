package oop.lab.lab5.ex2_2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String str = "Book[name=" + name + ",authors={";
        boolean isFirst = true;
        for (Author author : authors) {
            if (isFirst) {
                str = str + author.toString();
                isFirst = false;
            } else {
                str = str + "," + author.toString();
            }
        }
        return str + "},price=" + price + ",qty=" + qty + ']';
    }

    public String getAuthorNames() {
        String str = "";
        boolean isFirst = true;
        for (Author author : authors) {
            if (isFirst) {
                str = str + author.getName();
                isFirst = false;
            } else {
                str = str + "," + author.getName();
            }
        }
        return str;
    }

}
