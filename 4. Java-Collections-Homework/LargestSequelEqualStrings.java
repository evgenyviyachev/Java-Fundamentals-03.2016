import java.util.Scanner;

public class LargestSequelEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String largestSequence = "";
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1].equals(input[i])) {
                count++;
                if (i == input.length - 2 && count > maxCount) {
                    maxCount = count;
                    largestSequence = input[i];
                }
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    largestSequence = input[i];
                }
                count = 1;
            }
        }
        if (maxCount == 1) {
            System.out.println(input[0]);
        } else {
            for (int i = 0; i < maxCount; i++) {
                System.out.print(largestSequence + " ");
            }
        }
    }
}