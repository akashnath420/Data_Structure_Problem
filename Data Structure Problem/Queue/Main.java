import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array size : ");
        int n = sc.nextInt();

        int[] data = new int[n];

        Queue list = new Queue(data);

        for(int i = 0; i < n; i++) {
            list.enQueue((int)(1 + 10 * Math.random()));
        }
        System.out.print("The Queue list is : ");
        list.print();

        list.deQueue();
        list.deQueue();
        list.deQueue();
        System.out.print("After delete 3 data and list is : ");
        list.print();
    }
}