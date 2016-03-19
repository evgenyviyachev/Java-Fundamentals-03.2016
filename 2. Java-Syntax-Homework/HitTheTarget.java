import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        if (target >= 0 && target <= 40) {
            for (int i = 1; i <= 20; i++) {
                if ((target - i) < 20 && (target - i) > 0) {
                    System.out.printf("%d + %d = %d\n", i, target - i, target);
                } else if ((target - i) < 0) {
                    System.out.printf("%d - %d = %d\n", i, i - target, target);
                }
            }
        } else {
            System.out.println("Unreachable target.");
        }
    }
}