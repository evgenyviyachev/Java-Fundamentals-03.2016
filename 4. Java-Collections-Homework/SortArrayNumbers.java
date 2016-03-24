import java.util.Arrays;
import java.util.Scanner;

public class SortArrayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // The easy way:
        // Arrays.sort(numbers);

        int count;
        do {
            count = 0;
            for (int i = 0; i < n - 1; i++) {
                int temp;
                count = 0;
                if (numbers[i + 1] < numbers[i]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    count++;
                }
            }
        } while (count > 0);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}