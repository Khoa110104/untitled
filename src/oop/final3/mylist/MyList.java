package oop.final3.mylist;

public interface MyList {
    void add(Object obj);

    void add(Object obj, int index);

    Object get(int index);

    void remove(int index);

    int size();
}
