import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax = Integer.parseInt(scanner.next());
        int ay = Integer.parseInt(scanner.next());
        scanner.nextLine();
        int bx = Integer.parseInt(scanner.next());
        int by = Integer.parseInt(scanner.next());
        scanner.nextLine();
        int cx = Integer.parseInt(scanner.next());
        int cy = Integer.parseInt(scanner.next());

        int area = (int)Math.abs(0.5 * (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)));

        if (area != 0) {
            System.out.printf("%d", area);
            System.out.println();
        } else {
            System.out.println(0);
        }
    }
}
