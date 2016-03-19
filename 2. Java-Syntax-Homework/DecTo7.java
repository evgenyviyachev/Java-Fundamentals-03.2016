import java.util.Scanner;

public class DecTo7 {
    public static void main(String[] args) {
        String base7Num = Integer.toString(Integer.parseInt(new Scanner(System.in).next(), 10), 7);
        System.out.println(base7Num);
    }
}