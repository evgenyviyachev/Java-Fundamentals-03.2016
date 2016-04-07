import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<String> validEmails = new ArrayList<>();
        Pattern email = Pattern.compile("\\w+([-._]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        for (int i = 0; i < input.length; i++) {
            Matcher matcher = email.matcher(input[i]);
            if (matcher.find()) {
                validEmails.add(input[i]);
            }
        }
        for (String validEmail : validEmails) {
            System.out.println(validEmail);
        }
    }
}