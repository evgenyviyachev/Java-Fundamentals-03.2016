import java.util.Scanner;

public class SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cards = scanner.nextLine().split(" ");
        int[] cardValues = new int[cards.length];
        for (int i = 0; i < cardValues.length; i++) {
            if (cards[i].startsWith("1")) {
                cardValues[i] = 10;
            } else if (cards[i].startsWith("J")) {
                cardValues[i] = 12;
            } else if (cards[i].startsWith("Q")) {
                cardValues[i] = 13;
            } else if (cards[i].startsWith("K")) {
                cardValues[i] = 14;
            } else if (cards[i].startsWith("A")) {
                cardValues[i] = 15;
            } else {
                cardValues[i] = Integer.parseInt(cards[i].substring(0, 1));
            }
        }
        int sum = 0;
        boolean repeating = false;
        for (int i = 0; i < cardValues.length - 1; i++) {
            if (cardValues.length == 1) {
                break;
            }
            if (cardValues[i] == cardValues[i + 1]) {
                sum += cardValues[i] * 2;
                repeating = true;
            } else {
                if (repeating == true) {
                    sum += cardValues[i] * 2;
                } else {
                    sum += cardValues[i];
                }
                repeating = false;
            }
        }
        if (cardValues.length != 1 && cardValues[cardValues.length - 1] == cardValues[cardValues.length - 2]) {
            sum += cardValues[cardValues.length - 1] * 2;
        } else {
            sum += cardValues[cardValues.length - 1];
        }
        System.out.println(sum);
    }
}