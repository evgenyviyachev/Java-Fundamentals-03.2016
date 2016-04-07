import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().toLowerCase().split("\\W+");
        String word = scanner.next().toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}