import java.util.Scanner;

public class Recursion1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursion1ToN(n);
    }

    public static void recursion1ToN(int n) {
        if (n < 1) {
            return;
        }
        // The order of the output depends on the order of the next two commands:
        // 1. If the recursive call is first, it will print the numbers from 1 to 5.
        // 2. If the println() call is first, it will print the numbers from 5 to 1.
        recursion1ToN(n - 1);
        System.out.println(n);
    }
}
