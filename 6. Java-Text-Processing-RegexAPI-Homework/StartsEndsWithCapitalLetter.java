import java.util.Scanner;

public class StartsEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\W\\d]+");
        for (int i = 0; i < input.length; i++) {
            if (Character.isUpperCase(input[i].charAt(0))
                    && Character.isUpperCase(input[i].charAt(input[i].length() - 1))) {
                System.out.print(input[i] + " ");
            }
        }
        //with regex pattern -> "\\^[A-Z]\\w*[A-Z]\\$" -> for each word (input[i])
    }
}