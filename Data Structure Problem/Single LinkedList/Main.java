import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of node : ");
        int n = sc.nextInt();
        LinkedListAlgorithm list = new LinkedListAlgorithm();

        for(int i = 0; i < n; i++) {
            list.addLast();
        }
        System.out.print("All Node : ");
        list.print();
        list.addMiddle();
        System.out.print("Add Middle Position : ");
        list.print();
        System.out.print("Delete First position : ");
        list.deleteFirst();
        list.print();
        System.out.print("Delete Last position : ");
        list.deleteLast();
        list.print();
        list.deleteMiddle();
        System.out.print("Delete Middle position : ");
        list.print();
    }
}