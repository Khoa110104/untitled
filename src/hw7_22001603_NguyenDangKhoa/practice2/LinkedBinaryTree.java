package hw7_22001603_NguyenDangKhoa.practice2;

public class LinkedBinaryTree implements BinaryTreeInterface {


    private Node root;
    private int size;

    public LinkedBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public Node addRoot(int element) {
        if (root != null) {
            System.out.println("Tree has root already");
        }
        root = new Node(element, null, null, null);
        size++;
        return root;
    }

    public Node addLeft(Node p, int element) {
        if (p == null) {
            System.out.println("Node unknown!!!");
            return null;
        }
        if (p.left != null) {
            System.out.println("Left child already exists!!!");
        } else {
            p.left = new Node(element, p, null, null);
            size++;
        }
        return p.left;
    }

    public Node addRight(Node p, int element) {
        if (p == null) {
            System.out.println("Node unknown!!!");
            return null;
        }
        if (p.right != null) {
            System.out.println("Right child already exists!!!");
        } else {
            p.right = new Node(element, p, null, null);
            size++;
        }
        return p.right;
    }

    @Override
    public Node root() {
        if (!isEmpty()) {
            return root;
        }
        return null;
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
    public int numChildren(Node p) {
        if (p == null) {
            System.out.println("Node unknown");
            return -1;
        }
        int childCount = 0;

        if (p.left != null) {
            childCount++;
        }
        if (p.right != null) {
            childCount++;
        }
        return childCount;
    }

    @Override
    public Node parent(Node p) {
        if (p == root || p == null) {
            return null;
        }
        return p.parent;
    }

    @Override
    public Node left(Node p) {
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
    public Node right(Node p) {
        if (p == null) {
            System.out.println("Node unknown");
            return null;
        }

        return p.right;
    }

    @Override
    public Node sibling(Node p) {
        Node parentNode = p.parent;
        if (parentNode != null && parentNode.left != null && parentNode.right != null) {
            if (parentNode.left == p) {
                return parentNode.right;
            } else {
                return parentNode.left;
            }
        }
        return null;
    }

    public void printTree(Node root) {
        System.out.println("Linked Binary Tree:");
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
    public Node buildTree() {
        root = addRoot(1);
        Node L = addLeft(root, 2);
        Node R = addRight(root, 3);
        Node RL = addLeft(R, 6);
        Node LL = addLeft(L, 4);
        Node LR = addRight(L, 5);
        return root;
    }
}
