package train.stackandqueue.s1;


public class TestMain {
    public static void main(String[] args) {
        //ArrayWithGeneric LinkedListStack
        MyArrayStack myArrayStack = new MyArrayStack(3);

        myArrayStack.push(1);
        myArrayStack.print();
        myArrayStack.push(2);
        myArrayStack.print();
        myArrayStack.push(3);
        myArrayStack.print();
        myArrayStack.push(4);
        myArrayStack.print();

        myArrayStack.pop();
        myArrayStack.print();
        myArrayStack.pop();
        myArrayStack.print();
        myArrayStack.pop();
        myArrayStack.print();

        //ArrayWithGeneric LinkedListQueue
        MyArrayQueue myArrayQueue = new MyArrayQueue(3);

        System.out.println(myArrayQueue.push(1));
        System.out.println(myArrayQueue.count());
        System.out.println(myArrayQueue.push(2));
        System.out.println(myArrayQueue.count());
        System.out.println(myArrayQueue.push(3));
        System.out.println(myArrayQueue.count());
        System.out.println(myArrayQueue.push(4));
        System.out.println(myArrayQueue.count());
        myArrayQueue.print();

        System.out.println(myArrayQueue.pop());
        myArrayQueue.print();
        System.out.println(myArrayQueue.pop());
        myArrayQueue.print();
        System.out.println(myArrayQueue.pop());
        myArrayQueue.print();
        System.out.println(myArrayQueue.pop());
        myArrayQueue.print();

        //Linked List LinkedListStack
        MyLinkedListStack stack = new MyLinkedListStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();

        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();

        //Linked List LinkedListQueue
        MyLinkedListQueue queue = new MyLinkedListQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.print();

        System.out.println(queue.pop());
        queue.print();
        System.out.println(queue.pop());
        queue.print();
        System.out.println(queue.pop());
        queue.print();
        System.out.println(queue.pop());
        queue.print();
    }
}
