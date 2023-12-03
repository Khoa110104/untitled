package train.stackandqueue.s1;

public interface IStackQueue {
    boolean push(int value);
    int pop();
    boolean isFull();
    boolean isEmpty();
    void print();
}
