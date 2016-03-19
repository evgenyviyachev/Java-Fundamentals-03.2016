
import java.util.Locale;
import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double temp = Math.min(a, b);
        double smallest = Math.min(temp, c);

        System.out.println(smallest);
    }
}