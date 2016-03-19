import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = a*b;
        System.out.println(c);
    }
}