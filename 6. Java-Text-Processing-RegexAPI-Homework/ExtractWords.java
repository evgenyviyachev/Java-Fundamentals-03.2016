import java.util.Scanner;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\W\\d]+");
        System.out.println(String.join(" ", input));
    }
}