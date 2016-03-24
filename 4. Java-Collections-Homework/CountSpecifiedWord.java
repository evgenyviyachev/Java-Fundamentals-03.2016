import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().toLowerCase().split("\\W+");
        String word = scanner.next().toLowerCase();
        //Pattern pattern = Pattern.compile("\\W+" + word + "\\W+");
        //Matcher matcher = pattern.matcher(text);
        //int count = 0;
        //while (matcher.find()) {
        //    count++;
        //}
        //System.out.println(count);
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}