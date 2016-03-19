import java.util.Scanner;

public class PointsInsideHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.next());
        double y = Double.parseDouble(scanner.next());

        double a = (17.5 - 12.5) * (y - 8.5) - (3.5 - 8.5) * (x - 12.5);
        double b = (22.5 - 17.5) * (y - 3.5) - (8.5 - 3.5) * (x - 17.5);
        double c = (12.5 - 22.5) * (y - 8.5) - (8.5 - 8.5) * (x - 22.5);
        int sign1 = (int) Math.signum(a);
        int sign2 = (int) Math.signum(b);
        int sign3 = (int) Math.signum(c);

        if (((sign1 == sign2 && sign2 == sign3) || sign1 == 0 || sign2 == 0 || sign3 == 0)
                || (12.5 <= x && x <= 17.5 && 8.5 <= y && y <= 13.5)
                || (20 <= x && x <= 22.5 && 8.5 <= y && y <= 13.5)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}