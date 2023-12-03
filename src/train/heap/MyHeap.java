package train.heap;

import java.util.EmptyStackException;

public class MyHeap {
    private int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE];
    private int size;

    public MyHeap() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[1];
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void add(int v) {
        size++;
        arr[size] = v;
        int currentIndex = size;
        int parentIndex = currentIndex / 2;
        while (parentIndex != 0 && arr[parentIndex] > arr[currentIndex]) {
            swap(parentIndex, currentIndex);
            currentIndex = parentIndex;
            parentIndex = currentIndex / 2;
        }
    }

    public int poll() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int minRoot = arr[1];
        arr[1] = arr[size];
        size--;
        // heapify-down
        heapifyDown(1);
        return minRoot;
    }

    public void heapifyDown(int currentIndex) {
        while ((2 * currentIndex) <= size) {
            int leftChildIndex = currentIndex * 2;
            int rightChildIndex = leftChildIndex + 1;
            int smallerChildIndex = leftChildIndex;
            if (rightChildIndex <= size && arr[rightChildIndex] < arr[leftChildIndex]) {
                smallerChildIndex = rightChildIndex;
            }
            if (arr[currentIndex] > arr[smallerChildIndex]) {
                swap(currentIndex, smallerChildIndex);
                currentIndex = smallerChildIndex;
            } else {
                break;
            }
        }
    }
    public void remove(int v) {
        int currentIndex = -1;
        for (int i = 1; i < size; i++) {
            if (arr[i] == v) {
                currentIndex = i;
                break;
            }
        }
        if (currentIndex == -1) {
            System.out.println("Khong tim thay");
            return;
        }
        arr[currentIndex ] = arr[size];
        size--;
        heapifyDown(currentIndex);
    }

    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();
        System.out.println("--------------       MinHeap--------------");
        System.out.println("add: 10->5->1->6");
        myHeap.add(10);
        myHeap.add(5);
        myHeap.add(1);
        myHeap.add(6);
        System.out.println("peek: " + myHeap.peek());
        myHeap.remove(1);
        System.out.println("peek: " + myHeap.peek());
        myHeap.remove(6);
        while (myHeap.isEmpty() == false) {
            System.out.println("Poll: " + myHeap.poll());
        }
    }
}
// heapsort độ phức tạp trung bình và xấu nhất nlogn.
// ưu điểm:  độ phức tạp ổn định, hiệu suất với dữ liêu lớn hơn inser, bubb
// tốn ít bộ nhớ ngoài hơn merge
// nhược điểm: không ổn định với các phần tử có cùng giá trị
// triển khai phức tạp
// cần sử dụng không gian lưu trữ là 1 cây
// thao tác của heap trung bình là logn.nhưng trường hợp xấu nhat co the la n