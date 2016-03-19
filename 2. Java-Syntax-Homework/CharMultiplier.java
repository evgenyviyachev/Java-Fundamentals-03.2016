import java.util.Scanner;

public class CharMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.next();
        String secondStr = scanner.next();
        scanner.nextLine();
        System.out.println(charMultiplier(firstStr, secondStr));
    }

    public static long charMultiplier(String firstS, String secondS) {
        long product = 0;
        if (firstS.length() >= secondS.length()) {
            for (int i = 0; i < secondS.length(); i++) {
                product += firstS.charAt(i) * secondS.charAt(i);
            }
            for (int i = secondS.length(); i < firstS.length(); i++) {
                product += firstS.charAt(i);
            }
        } else {
            for (int i = 0; i < firstS.length(); i++) {
                product += firstS.charAt(i) * secondS.charAt(i);
            }
            for (int i = firstS.length(); i < secondS.length(); i++) {
                product += secondS.charAt(i);
            }
        }
        return product;
    }
}