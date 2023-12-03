package homework.homework5.combo2.ex1;

import java.io.*;
import java.util.Arrays;

public class ArrayBinaryTree<E> implements BinaryTreeInterface<Integer> {
    private E[] array;
    private int n = 0;
    private final int defaultSize = 100;

    public ArrayBinaryTree() {
        array = (E[]) new Object[defaultSize];
    }

    public void setRoot(E element) {
        if (array[1] != null) {
            array[1] = element;
        } else {
            array[1] = element;
            n++;
        }
    }

    public void setLeft(int p, E element) {
        if (p < 1 || p >= array.length) {
            System.out.println("Out of index");
            return;
        }
        if (array[p] == null) {
            System.out.println("There is no value at position p");
            return;
        }
        int leftChildIndex = p * 2;
        if (leftChildIndex >= array.length) {
            array = Arrays.copyOf(array, leftChildIndex + 1);
        }
        if (array[leftChildIndex] != null) {
            array[leftChildIndex] = element;
        } else {
            array[leftChildIndex] = element;
            n++;
        }

    }

    public void setRight(int p, E element) {
        if (p < 0 || p >= array.length) {
            System.out.println("Out of index");
        }
        if (array[p] == null) {
            System.out.println("There is no value at position p");
            return;
        }
        int rightChildIndex = p * 2 + 1;
        if (rightChildIndex >= array.length) {
            array = Arrays.copyOf(array, rightChildIndex + 1);
        }
        if (array[rightChildIndex] != null) {
            array[rightChildIndex] = element;
        } else {
            array[rightChildIndex] = element;
            n++;
        }
    }

    @Override
    public Integer root() {
        if (!isEmpty()) {
            return 1;
        }
        return null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int numChildren(Integer p) {
        if (p < 0 || p >= array.length) {
            System.out.println("Out of index");
            return -1;
        }
        if (array[p] == null) {
            return 0;
        }
        int leftChildIndex = p * 2;
        int rightRightIndex = p * 2 + 1;
        int childCount = 0;
        if (leftChildIndex < array.length && array[leftChildIndex] != null) {
            childCount++;
        }
        if (rightRightIndex < array.length && array[rightRightIndex] != null) {
            childCount++;
        }
        return childCount;
    }

    @Override
    public Integer parent(Integer p) {
        if (p < 0 || p >= array.length) {
            System.out.println("Out of index");
            return -1;
        } else if (array[p] == null) {
            return -1;
        }
        int parent = p / 2;
        if (array[parent] != null) {
            return parent;
        }
        return null;
    }

    @Override
    public Integer left(Integer p) {
        if (p < 0 || p >= array.length) {
            System.out.println("Out of index");
            return -1;
        } else if (array[p] == null) {
            return -1;
        }
        int leftChildIndex = p * 2;
        if (array[leftChildIndex] != null && leftChildIndex < array.length) {
            return leftChildIndex;
        }
        return 0;
    }

    @Override
    public Integer right(Integer p) {
        if (p < 0 || p >= array.length) {
            System.out.println("Out of index");
            return -1;
        } else if (array[p] == null) {
            return -1;
        }
        int rightChildIndex = p * 2 + 1;
        if (array[rightChildIndex] != null && rightChildIndex < array.length) {
            return rightChildIndex;
        }
        return 0;
    }

    @Override
    public Integer sibling(Integer p) {
        if (p < 0 || p >= array.length) {
            System.out.println("Out of index");
            return -1;
        } else if (array[p] == null) {
            return -1;
        }
        Integer parent = parent(p);
        if (parent!= null && array[left(parent)] != null && array[right(parent)] != null  ) {
            if (p.equals(left(parent))) {
                return right(parent);
            } else if (p.equals(right(parent))) {
                return left(parent);
            }
        }
        return null;
    }

    public void printTree() {
        System.out.println("Array Binary Tree: ");
        printTree(1, 0);
    }

    public void printTree(int currIndex, int depth) {

        if (array[currIndex] == null) {
            return;
        }
        printTree(right(currIndex), depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(array[currIndex]);
        printTree(left(currIndex), depth + 1);
    }


public void printTreeToFile(String fileName) {
    try (FileWriter fileWriter = new FileWriter(fileName);
         PrintWriter printWriter = new PrintWriter(fileWriter)) {
        printWriter.println("Array Binary Tree: ");
        printTreeToFile(1, 0, printWriter);
        System.out.println("Cây nhị phân được lưu vào: " + fileName);
    } catch (IOException exception) {
        exception.printStackTrace();
    }
}

    public void printTreeToFile(int currIndex, int depth, PrintWriter writer) {
        if (array[currIndex] == null) {
            return;
        }
        printTreeToFile(right(currIndex), depth + 1, writer);
        for (int i = 0; i < depth; i++) {
            writer.print("    ");
        }
        writer.println(array[currIndex]);
        printTreeToFile(left(currIndex), depth + 1, writer);
    }


    public static void main(String[] args) {
        System.out.println("---------------ArrayBinaryTree---------------");
        ArrayBinaryTree<Integer> arrayTree = new ArrayBinaryTree<>();


        arrayTree.setRoot(1);
        arrayTree.setLeft(1, 2);
        arrayTree.setRight(1, 3);
        arrayTree.setLeft(3, 6);
        arrayTree.setLeft(2, 4);
        arrayTree.setRight(2, 5);
        String fileName = "C:\\Learning\\java1\\dsa\\src\\homework\\homework5\\combo2\\ex1\\output1.txt";
        arrayTree.printTreeToFile(fileName);

        arrayTree.printTree();

        System.out.println("Size is: " + arrayTree.size());
        System.out.println("Root is: " + arrayTree.root());
        System.out.println("Empty is: " + arrayTree.isEmpty());
        System.out.println("Number of children of element 2 is: " + arrayTree.numChildren(2));
        System.out.println("Number of children of element 3 is: " + arrayTree.numChildren(3));
        System.out.println("Parent of element 3 is: " + arrayTree.parent(3));
        System.out.println("Left child of element 3 is: " + arrayTree.left(3));
        System.out.println("Sibling of element 4 is: " + arrayTree.sibling(4));

    }
}
