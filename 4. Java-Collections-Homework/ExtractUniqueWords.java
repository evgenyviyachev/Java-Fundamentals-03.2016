import java.util.*;

public class ExtractUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().split("\\W+");
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!output.contains(words[i])) {
                output.add(words[i]);
            }
        }
        Collections.sort(output);
        for (String s : output) {
            System.out.print(s + " ");
        }
    }
}