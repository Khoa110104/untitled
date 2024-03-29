package oop.lab.lab11.iterator.example;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iterator = namesRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name is: " + name);
        }
    }
}