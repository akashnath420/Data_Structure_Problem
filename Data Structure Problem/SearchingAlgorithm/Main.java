package SearchingAlgorithm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Array size : ");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.print("Randomly number genarate : ");
        for(int i = 0; i < n; i++) {
            data[i] = (int) (100 * Math.random());
        }

        for(int i = 0; i < n; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();

        System.out.println();

       SearchingAlgorithm search = new SearchingAlgorithm(data);

        System.out.print("Search the number : ");
        int input = sc.nextInt();

        search.linearSearch(input);
        search.binarySearch(input);
    }
}
