import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.next());
        double b = Double.parseDouble(scanner.next());
        double c = Double.parseDouble(scanner.next());

        double f1 = Math.pow((a * a + b * b) / (a * a - b * b), (a + b + c) / Math.sqrt(c));
        double f2 = Math.pow(a * a + b * b - c * c * c, a - b);

        double avgNum = (a + b + c) / 3;
        double avgF = (f1 + f2) / 2;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f\n", f1, f2, Math.abs(avgNum - avgF));
    }
}