import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArrayExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                filter(s -> isNumber(s)).map(Integer::parseInt).collect(Collectors.toList());
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int sumCollectors = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        int sumReduce = numbers.stream().reduce((x, y) -> x + y).get();
        System.out.println(sum);
        System.out.println(sumCollectors);
        System.out.println(sumReduce);
    }

    //first method
    private static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.toCharArray()[i])) {
                return false;
            }
        }
        return true;
    }

    //second method
    private static boolean isNumber2(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}