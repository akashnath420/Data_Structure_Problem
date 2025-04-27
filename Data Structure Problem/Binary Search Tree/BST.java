import java.sql.SQLOutput;
import java.util.Scanner;

public class BST {
    Node root;
    int size = 0;

    public Node getNode() {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter the value : ");

        newNode.value = sc.nextInt();
        newNode.left = null;
        newNode.right = null;

        return newNode;
    }

    public void insertBST() {
        Node newNode = getNode();
        Node temp = root;

        if(root == null) {
            root = newNode;
        }
        else {
            while(true) {
                if(newNode.value < temp.value) {
                    if(temp.left == null) {
                        temp.left = newNode;
                        break;
                    }
                    else {
                        temp = temp.left;
                    }
                }
                else if(newNode.value > temp.value) {
                    if(temp.right == null) {
                        temp.right = newNode;
                        break;
                    }
                    else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    public void inOder(Node temp) {
        if(temp == null) {
            return;
        }
        inOder(temp.left);
        System.out.print(temp.value +" ");
        inOder(temp.right);
    }

    public void preOder(Node temp) {
        if(temp == null) {
            return;
        }
        System.out.print(temp.value +" ");
        preOder(temp.left);
        preOder(temp.right);
    }

    public void postOder(Node temp) {
        if(temp == null) {
            return;
        }
        postOder(temp.left);
        postOder(temp.right);
        System.out.print(temp.value +" ");
    }
}
