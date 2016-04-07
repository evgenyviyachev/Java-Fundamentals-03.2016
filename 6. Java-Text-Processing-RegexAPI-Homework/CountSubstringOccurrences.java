import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().toLowerCase().split("\\W+");
        String substring = scanner.next().toLowerCase();
        Pattern pattern = Pattern.compile(substring);
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            Matcher matcher = pattern.matcher(text[i]);
            boolean found = matcher.find();
            while (found) {
                count++;
                found = matcher.find(matcher.start() + 1);
            }
        }
        System.out.println(count);
    }
}