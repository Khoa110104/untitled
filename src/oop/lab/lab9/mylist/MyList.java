package oop.lab.lab9.mylist;

public interface MyList {
    void add(Object obj, int index);

    void add(Object obj);

    void remove(int index);

    int size();

    Object get(int index);

}
