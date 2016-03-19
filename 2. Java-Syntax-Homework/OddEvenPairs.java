import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        if (numbers.length % 2 == 1) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < numbers.length - 1; i += 2) {
                if ((Integer.parseInt(numbers[i])) % 2 == 0 && (Integer.parseInt(numbers[i + 1])) % 2 == 0) {
                    System.out.printf("%s, %s -> both are even\n", numbers[i], numbers[i + 1]);
                } else if ((Integer.parseInt(numbers[i])) % 2 == 1 && (Integer.parseInt(numbers[i + 1])) % 2 == 1) {
                    System.out.printf("%s, %s -> both are odd\n", numbers[i], numbers[i + 1]);
                } else {
                    System.out.printf("%s, %s -> different\n", numbers[i], numbers[i + 1]);
                }
            }
        }
    }
}