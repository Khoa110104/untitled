package train.tree;

import java.util.ArrayList;
import java.util.List;

public class  MyBinarySearchTree {
    private TreeNode root;

    public MyBinarySearchTree() {
    }
    //Them node bang vong lap
    public void insertByLoop(int value) {
        TreeNode newNode = new TreeNode(value);
        //Neu gia tri them vao da co gia tri
        if (root.value == value) {
            System.out.println("Da co!!!");
            return;
        }
        //TH1: root == null
        if (root == null) {
            root = newNode;
        } else {
            TreeNode tempNode = root;
            while (true) {
                if (value > tempNode.value) {
                    if (tempNode.right == null) {
                        tempNode.right = newNode;
                        break;
                    } else {
                        tempNode = tempNode.right;
                    }
                } else { //value < tempNode.value
                    if (tempNode.left == null) {
                        tempNode.left = newNode;
                        break;
                    } else {
                        tempNode = tempNode.left;
                    }
                }
            }
        }
    }
    //Them node bang de quy
    public TreeNode insertByRecursion(TreeNode rootNode, int value) {
        if (rootNode.value == value) {
            System.out.println("da co!!");
            return rootNode;
        }
        if (rootNode == null) {
            return new TreeNode(value);
        }
        TreeNode newNode = new TreeNode(value);
        if (value < rootNode.value) {
            if (rootNode.left == null) {
                rootNode.left = newNode;
            }else {
                insertByRecursion(rootNode.left, value);
            }
        } else {
            if (rootNode.right == null) {
                rootNode.right = newNode;
            } else {
                insertByRecursion(rootNode.right, value);
            }
        }
        return rootNode;
    }
    //Tim con trai cung ben phai
    public TreeNode findLeftModeNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftMostNode = root;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }
    //Xoa mot node trong tree co gia tri key
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        //B1: Di tim Node xoa
        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        }else if (key > root.value){
            root.right = deleteNode(root.right, key);
        } else { //root.value = key => xoa root | Xac dinh duoc Node xoa
            //B2: Xoa Node root
            //TH1: root la node la:
            if (root.left == null && root.right == null) {
                return null;
            }
            //TH2: Chi co mot con: ben trai
            if (root.left != null && root.right == null) {
                return root.left;
            }
            //TH2: Chi co mot con: ben phai
            if (root.left == null && root.right != null) {
                return root.right;
            }
            //TH3: Ton tai 2 con
            //Tim node trai cung cua cay con ben phai
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.value = leftModeNode.value;
            root.right = deleteNode(root.right, leftModeNode.value);
        }
        return root;
    }
    //Tim phan tu key trong tree
    public TreeNode searchBinaryTree(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.value){
            return searchBinaryTree(root.left, key);
        } else if (key > root.value) {
            return searchBinaryTree(root.right, key);
        } else { // root.value = key
            return root;
        }
    }
    //Node - L - R
    public void preOder(TreeNode currentNode) {
        if (currentNode == null) {
            return;
        }
        //Duyet currentNode truoc
        System.out.print(currentNode.value + " ");
        preOder(currentNode.left);
        preOder(currentNode.right);
    }

    //L - Node - R
    public void inOder(TreeNode currentNode) {
        if (currentNode ==null) {
            return;
        }
        //Duyet ben trai
        inOder(currentNode.left);
        //Duyet current truoc
        System.out.print(currentNode.value + " " );
        //Duyet ben phai
        inOder(currentNode.right);
    }

    //L - R - Node
    public void postOder(TreeNode currentNode) {
        if (currentNode == null){
            return;
        }
        //Duyet ben trai
        preOder(currentNode.left);
        //Duyet ben phai
        preOder(currentNode.right);
        //Duyet currentNode
        System.out.print(currentNode.value + " ");
    }
    List<Integer> duyetOder = new ArrayList<>();
    public List<Integer> preOderTraversal(TreeNode root) {
        if (root == null) {
            return duyetOder;
        }
        //Duyet current truoc
        //System.out.print(currentNode.value + " ");
        duyetOder.add(root.value);
        //Duyet ban trai | Duyet ben phai
        preOderTraversal(root.left);
        preOderTraversal(root.right);
        return duyetOder;
    }
}
