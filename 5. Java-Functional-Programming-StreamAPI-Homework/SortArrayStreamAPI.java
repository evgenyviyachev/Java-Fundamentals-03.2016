import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortArrayStreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String order = scanner.nextLine();
        //method reference
        if (order.toLowerCase().equals("ascending")) {
            integers.stream().sorted((int1, int2) -> {
                return Integer.compare(int1, int2);
            }).forEach(num -> System.out.print(num + " "));
        }
        //lambda
        if (order.toLowerCase().equals("descending")) {
            integers.stream().sorted((int1, int2) -> int2.compareTo(int1)).forEach(num -> System.out.print(num + " "));
        }
    }
}