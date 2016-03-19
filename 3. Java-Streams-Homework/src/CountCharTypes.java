import java.io.*;

public class CountCharTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(
                new FileReader("resources/words.txt"));
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        while (true) {
            String s = bfr.readLine();
            if (s == null) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                if (Character.isWhitespace(s.charAt(i))) {
                    continue;
                } else if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    vowels++;
                } else if (s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == ',') {
                    punctuation++;
                } else {
                    consonants++;
                }

            }
        }

        PrintWriter bfw = new PrintWriter(
                new FileWriter("resources/count-chars.txt"));
        bfw.println("Vowels: " + vowels);
        bfw.println("Consonants: " + consonants);
        bfw.println("Punctuation: " + punctuation);

        bfw.close();
        bfr.close();
    }
}