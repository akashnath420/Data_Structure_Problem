import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the how many number you input : ");
        int n = sc.nextInt();

        BST bst = new BST();

        for(int i = 0; i < n; i++) {
            bst.insertBST();
        }

        System.out.print("Inoder : ");
        bst.inOder(bst.root);
        System.out.println();

        System.out.print("preoder : ");
        bst.preOder(bst.root);
        System.out.println();

        System.out.print("postoder : ");
        bst.postOder(bst.root);
        System.out.println();
    }
}