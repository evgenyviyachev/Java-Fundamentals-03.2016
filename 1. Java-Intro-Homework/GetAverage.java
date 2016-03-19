import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        averageNumbers(a, b, c);
    }

    public static void averageNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.println(String.format( "%.2f", average ));
    }
}