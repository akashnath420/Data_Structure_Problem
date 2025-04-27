import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] data = new int[size];

        for(int i = 0; i < size; i++)   {
            data[i] = (int) (1 + 100 * Math.random());
        }

        System.out.print("Randomly number genarate : ");
        for(int i = 0; i < size; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();

        Sorting sort = new Sorting(data);
        sort.bubbleSorting();
        sort.selectionSorting();

    }

}