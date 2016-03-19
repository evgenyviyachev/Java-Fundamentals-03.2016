import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomizeNM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }
        for (int i = N; i <= M; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}