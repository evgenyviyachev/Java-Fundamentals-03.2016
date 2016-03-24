import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        int count = 0;
        if (n < 4) {
            System.out.println("No");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            if (i==j || i==k || i==l || j==k || j==l || k==l) {
                                continue;
                            } else {
                                if ((numbers[i]+numbers[j]).equals(numbers[k]+numbers[l])) {
                                    System.out.println(numbers[i] + "|" + numbers[j] + "==" + numbers[k] + "|" + numbers[l]);
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            if (count == 0) {
                System.out.println("No");
            }
        }
    }
}