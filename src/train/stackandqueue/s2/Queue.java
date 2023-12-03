package train.stackandqueue.s2;

public interface Queue<T> extends Iterable<T> {
    void enqueue(T data);
    T dequeue();
    T queue();
    int size();
    boolean isEmpty();
}
