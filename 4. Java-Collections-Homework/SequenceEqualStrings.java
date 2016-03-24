import java.util.Scanner;

public class SequenceEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        System.out.print(input[0]);
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i+1].equals(input[i])) {
                System.out.print(" " + input[i+1]);
                continue;
            }
            System.out.println();
            System.out.print(input[i+1]);
        }
    }
}