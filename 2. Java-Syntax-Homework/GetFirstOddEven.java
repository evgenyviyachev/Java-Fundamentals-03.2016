import java.util.Scanner;

public class GetFirstOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersStr = (scanner.nextLine().split(" "));
        Integer[] numbers = new Integer[numbersStr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        String[] command = (scanner.nextLine().split(" "));
        firstOddEven(numbers, Integer.parseInt(command[1]), command[2]);
    }

    public static void firstOddEven(Integer[] numbers, Integer n, String command) {
        int count = 0;
        if (command.equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 1 && count < n) {
                    System.out.print(numbers[i] + " ");
                    count++;
                }
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0 && count < n) {
                    System.out.print(numbers[i] + " ");
                    count++;
                }
            }
        }
    }
}