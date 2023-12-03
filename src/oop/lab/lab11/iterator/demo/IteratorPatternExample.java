package oop.lab.lab11.iterator.demo;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog(new String[]{"Facebook", "Youtube", "Zalo"});
        Iterator iterator = productCatalog.getIterator();
        while(iterator.hasNext()) {
            System.out.println("Product Name = " + iterator.next());
        }
    }
}
