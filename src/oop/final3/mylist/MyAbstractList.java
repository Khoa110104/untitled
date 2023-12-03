package oop.final3.mylist;

public abstract class MyAbstractList implements MyList {

    public boolean checkBoundaries(int index, int limit) {
        return index <= limit && index >= 0;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size(); i++) {
            s += "[" + get(i) + "]";
        }
        return s;
    }
}
