import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\W\\d_]");
        Arrays.stream(input).filter(s -> s.length() > 3).forEach(s -> System.out.print(s + " "));
    }
}