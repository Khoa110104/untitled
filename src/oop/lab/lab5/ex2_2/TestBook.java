package oop.lab.lab5.ex2_2;

public class TestBook {
    public static void main(String[] args) {
        //Test constructor and toString()
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

        //Test getAuthorNames()
        System.out.println(javaDummy.getAuthorNames());
    }
}