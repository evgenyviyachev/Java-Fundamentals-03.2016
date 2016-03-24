import java.util.Scanner;

public class CalculateNFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(CalculateNFact(N));
    }

    public static int CalculateNFact(int N) {
        if (N == 1) {
            return 1;
        }
        return N * CalculateNFact(N - 1);
    }
}