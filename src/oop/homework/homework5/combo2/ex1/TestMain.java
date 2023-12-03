package oop.homework.homework5.combo2.ex1;

import homework.homework5.combo2.ex1.ArrayBinaryTree;
import homework.homework5.combo2.ex1.LinkedBinaryTree;

public class TestMain {
    public static void main(String[] args) {
        //ArrayBinaryTree
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

        //BinarySearchAVLTree
        System.out.println("--------------------BinarySearchAVLTree--------------------");
        LinkedBinaryTree<Integer, LinkedBinaryTree.Node<Integer>> linkedTree = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<Integer> rootNode = linkedTree.addRoot(1);
        LinkedBinaryTree.Node<Integer> L = linkedTree.addLeft(rootNode, 2);
        LinkedBinaryTree.Node<Integer> R = linkedTree.addRight(rootNode, 3);
        LinkedBinaryTree.Node<Integer> RL = linkedTree.addLeft(R, 6);
        LinkedBinaryTree.Node<Integer> LL = linkedTree.addLeft(L, 4);
        LinkedBinaryTree.Node<Integer> LR  = linkedTree.addRight(L, 5);
        String fileName1 = "C:\\Learning\\java1\\dsa\\src\\homework\\homework5\\combo2\\ex1\\output2.txt";
        linkedTree.printTreeToFile(fileName1);

        linkedTree.printTree();
        System.out.println("Size is: " + linkedTree.size());
        System.out.println("Root is: " + linkedTree.root().element);
        System.out.println("Empty is: " + linkedTree.isEmpty());
        System.out.println("Number of children of element 2 is: " + linkedTree.numChildren(L) );
        System.out.println("Number of children of element 3 is: " + linkedTree.numChildren(R) );
        System.out.println("Parent of element 3 is: " + linkedTree.parent(R).element);
        System.out.println("Left child of element 3 is: "+linkedTree.left(R).element);
        if (linkedTree.sibling(LL) != null) {
            System.out.println("Sibling of element 4 is: " + linkedTree.sibling(LL).element);
        } else {
            System.out.println("Sibling of element 4 is: " + linkedTree.sibling(LL));
        }
    }
}
