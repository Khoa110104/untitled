package oop.midterm2023.mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     *
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        MyIterator iterator = iterator();
        String result = "";
        while (iterator.hasNext()) {
            result += "[" + iterator.next() + "] ";
        }
        return result;
    }
}
