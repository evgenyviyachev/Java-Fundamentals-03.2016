import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class SimpleExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] numbers = input.split("\\s*[+-]\\s*");
        String[] operations = input.split("\\s*[.\\d]+\\s*");

        BigDecimal result = new BigDecimal(numbers[0]);
        for (int i = 1; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                result = result.add(new BigDecimal(numbers[i]));
            } else {
                result = result.subtract(new BigDecimal(numbers[i]));
            }
        }
        DecimalFormat df = new DecimalFormat("#.0000000");
        System.out.println(df.format(result));
    }
}