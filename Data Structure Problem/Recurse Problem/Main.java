
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Factorial is : "+ Factorial(6));
        System.out.println("Fibonacci is : "+  Fibonacci(3));
        System.out.print("Reversing order : ");
        reversing(100);
        System.out.println();
        System.out.print("One Hundred Time : ");
        oneHundredTime(100);
        System.out.println();

        System.out.print("Write the word : ");
        String word = sc.next();
        if(isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("This is palindrome word");
        }
        else {
            System.out.println("this is not palindrome word");
        }


    }

    public static long Factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * Factorial(n - 1);
        }
    }

    public static long Fibonacci(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return Fibonacci(n - 1) + Factorial(n - 2);
        }
    }

    public static void reversing(int n) {
        if(n != 0) {
            System.out.print(n +" ");
            reversing(n - 1);
        }
    }

    public static void oneHundredTime(int n) {
        if(n != 0) {
            System.out.print("Java ");
            oneHundredTime(n - 1);
        }
    }

    public static boolean isPalindrome(String word, int start, int end) {
        if (start == end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1);
    }
}
