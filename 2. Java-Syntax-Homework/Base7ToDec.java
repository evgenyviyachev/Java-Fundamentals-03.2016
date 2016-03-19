import java.util.Scanner;

public class Base7ToDec {
    public static void main(String[] args) {
        String decNum = Integer.toString(Integer.parseInt(new Scanner(System.in).next(), 7), 10);
        System.out.println(decNum);
    }
}