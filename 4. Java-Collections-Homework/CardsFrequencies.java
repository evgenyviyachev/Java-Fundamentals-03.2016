import java.util.LinkedHashMap;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cards = scanner.nextLine().split(" ");
        LinkedHashMap<Character, Integer> cardsOccurrences = new LinkedHashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if (!cardsOccurrences.containsKey(cards[i].charAt(0))) {
                cardsOccurrences.put(cards[i].charAt(0), 1);
            } else {
                cardsOccurrences.put(cards[i].charAt(0),
                        cardsOccurrences.get(cards[i].charAt(0)) + 1);
            }
        }
        for (Character cardFace : cardsOccurrences.keySet()) {
            if (cardFace == '1') {
                System.out.print("10 -> ");
                System.out.printf("%.2f%%\n", (double) cardsOccurrences.get(cardFace) * 100 / cards.length);
                continue;
            }
            System.out.print(cardFace + " -> ");
            System.out.printf("%.2f%%\n", (double) cardsOccurrences.get(cardFace) * 100 / cards.length);
        }
    }
}