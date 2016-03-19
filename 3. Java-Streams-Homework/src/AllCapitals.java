import java.io.*;
import java.util.ArrayList;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(
                new FileReader("resources/lines.txt"));
        ArrayList<String> lines = new ArrayList<>();
        while (true) {
            String s = bfr.readLine();
            if (s == null) {
                break;
            }
            lines.add(s.toUpperCase());
        }

        PrintWriter bfw = new PrintWriter(
                new FileWriter("resources/lines2.txt"));
        for (int i = 0; i < lines.size(); i++) {
            bfw.println(lines.get(i));
        }

        bfw.close();
        bfr.close();
    }
}