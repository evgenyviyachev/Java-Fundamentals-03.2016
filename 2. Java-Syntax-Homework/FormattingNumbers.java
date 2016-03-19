
import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.print("|");
        String hex = Integer.toHexString(a).toUpperCase();
        System.out.printf("%-10s", hex);
        System.out.print("|");
        String bin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.print(bin);
        System.out.print("|");
        System.out.printf("%10.2f", b);
        System.out.print("|");
        System.out.printf("%-10.3f", c);
        System.out.print("|");
    }
}