package train.stackandqueue.s1;


public class MyArrayStack implements IStackQueue {
    private int[] array;
    private int size;
    private int topIndex;

    public MyArrayStack(int size) {
        this.size = size;
        array = new int[size];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -111;
    }

    @Override
    public boolean isFull() {
        return topIndex == size - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("LinkedListStack is Empty!!");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
