import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array size : ");
        int size = sc.nextInt();

        int[] array = new int[size];



        Algorithm algorithm = new Algorithm(array);

        for(int i = 0 ; i < size; i++) {
            algorithm.enqueue((int)(1 + 100 * Math.random()));
        }

        algorithm.print();


        algorithm.dequeue();
        algorithm.dequeue();
        algorithm.dequeue();
        algorithm.print();



    }
}