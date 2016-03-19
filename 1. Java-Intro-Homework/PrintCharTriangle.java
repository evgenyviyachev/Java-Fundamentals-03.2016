import java.util.Scanner;

public class PrintCharTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (char j = 97; j < i + 97; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (char j = 97; j < i + 97; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
