package oop.hw7_22001603_NguyenDangKhoa.combo2.ex2;

import hw7_22001603_NguyenDangKhoa.combo2.ex2.BinarySearchTreeInterface;
import hw7_22001603_NguyenDangKhoa.combo2.ex2.Node;

public class BinarySearchTree implements BinarySearchTreeInterface {


    protected hw7_22001603_NguyenDangKhoa.combo2.ex2.Node root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node root() {
        if (!isEmpty()) {
            return root;
        }
        return null;
    }

    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node addRoot(int element) {
        if (root != null) {
            System.out.println("Tree has root already");
        }
        root = new hw7_22001603_NguyenDangKhoa.combo2.ex2.Node(element);
        return root;
    }

    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node findMin() {
        return findLeftMostNode(root);
    }

    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node search(int x) {
        return search(x, root);
    }
    private boolean searchX(int x, hw7_22001603_NguyenDangKhoa.combo2.ex2.Node root) {
        if (root == null) {
            return false;
        }
        if (x < root.element) {
            return searchX(x, root.left);
        } else if (x > root.element) {
            return searchX(x, root.right);
        } else {
            return true;
        }
    }

    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node search(int x, hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p) {
        if (p == null) {
            return null;
        }
        if (x < p.element) {
            return search(x, p.left);
        } else if (x > p.element) {
            return search(x, p.right);
        } else {
            return p;
        }
    }

    public void insert(int x) {
        size++;
        if (root == null) {
            addRoot(x);
        } else {
            insert(x, root);
        }
    }

    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node insert(int x, hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p) {
        hw7_22001603_NguyenDangKhoa.combo2.ex2.Node newNode = new hw7_22001603_NguyenDangKhoa.combo2.ex2.Node(x);
        if (p == null) {
            p = newNode;

            return p;
        }
        if (p.element == x) {
            System.out.println("Node already exists!!!");
            return p;
        } else {
            hw7_22001603_NguyenDangKhoa.combo2.ex2.Node tempNode = p;
            while (true) {
                if (x > tempNode.element) {
                    if (tempNode.right == null) {
                        tempNode.right = newNode;
                        break;
                    } else {
                        tempNode = tempNode.right;
                    }
                } else {
                    if (tempNode.left == null) {
                        tempNode.left = newNode;
                        break;
                    } else {
                        tempNode = tempNode.left;
                    }
                }
            }

        }
        return p;
    }

    public void delete(int x) {
        if (searchX(x, root)) {
        size--;
        delete(x, root);
        } else {
            System.out.println("Không tìm thấy "  + x);
        }
    }

    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node delete(int x, hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p) {
        if (p == null) {
            return null;
        }
        if (x < p.element) {
            p.left = delete(x, p.left);
        } else if (x > p.element) {
            p.right = delete(x, p.right);
        } else {
            if (p.left == null && p.right == null) {
                return null;
            }
            if (p.left != null && p.right == null) {
                return p.left;
            }
            if (p.left == null && p.right != null) {
                return p.right;
            }
            hw7_22001603_NguyenDangKhoa.combo2.ex2.Node leftModeNode = findLeftMostNode(p.right);
            p.element = leftModeNode.element;
            p.right = delete(leftModeNode.element, p.right);
        }
        return p;
    }

    protected hw7_22001603_NguyenDangKhoa.combo2.ex2.Node findLeftMostNode(hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p) {
        if (p == null) {
            return null;
        }
        hw7_22001603_NguyenDangKhoa.combo2.ex2.Node leftMostNode = p;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node parent(hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p) {
        if (p == root || p == null) {
            return null;
        }
        return p.parent;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node left(hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p) {
        if (p == null) {
            System.out.println("Node unknown");
            return null;
        }

        if (p.left == null) {
            System.out.println("There are no left children");
            return null;
        }
        return p.left;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.combo2.ex2.Node right(hw7_22001603_NguyenDangKhoa.combo2.ex2.Node p) {
        if (p == null) {
            System.out.println("Node unknown");
            return null;
        }

        return p.right;
    }

    public void printTree() {
        System.out.println("Binary Search Tree:");
        printTree(root, 0);
    }

    public void printTree(Node currNode, int depth) {
        if (currNode == null) {
            return;
        }
        printTree(currNode.right, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(currNode.element);
        printTree(currNode.left, depth + 1);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);
        tree.insert(6);
        tree.insert(4);
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.printTree();
        System.out.println("Size: " + tree.size);
        tree.delete(5);
        System.out.println("Xóa phần tử 8: ");
        tree.delete(8);
        tree.printTree();
        System.out.println("Size: " + tree.size);
        System.out.println("Tồn tại phần tử 2: " + tree.searchX(2,tree.root));
        System.out.println("Phần tử 2: " + tree.search(2));
        System.out.println("Min: " + tree.findMin().element);
    }
}
