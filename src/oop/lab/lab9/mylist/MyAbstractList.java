package oop.lab.lab9.mylist;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {
    }

    void checkBoundaries(int index, int limit) {
        if (index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            stringBuilder.append(String.format("[%s] ", this.get(i).toString()));
        }
        return stringBuilder.toString();
    }
}