import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 0) {
            String hex = Integer.toHexString(input).toUpperCase();
            System.out.println(hex);
        } else {
            System.out.println("Try again.");
        }
    }
}