import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(
                new FileReader("resources/lines.txt"));
        while (true) {
            String s = bfr.readLine();
            if (s == null) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i);
            }
            System.out.println(sum);
        }
        bfr.close();
    }
}