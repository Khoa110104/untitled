package oop.homework.homework4.ex4;

public interface QueueInterface<E> extends Iterable<E> {
    void enqueue(E element);
    E dequeue();
    boolean isEmpty();

}
