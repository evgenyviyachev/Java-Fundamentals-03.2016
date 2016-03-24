import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] l1 = scanner.nextLine().split(" ");
        String[] l2 = scanner.nextLine().split(" ");
        ArrayList<Character> l1ToList = new ArrayList<>();
        for (int i = 0; i < l1.length; i++) {
            l1ToList.add(l1[i].charAt(0));
        }
        ArrayList<Character> finalList = new ArrayList<>();
        for (int i = 0; i < l1ToList.size(); i++) {
            finalList.add(l1ToList.get(i));
        }
        for (int i = 0; i < l2.length; i++) {
            if (!l1ToList.contains(l2[i].charAt(0))) {
                finalList.add(l2[i].charAt(0));
            }
        }
        for (Character character : finalList) {
            System.out.print(character + " ");
        }
    }
}