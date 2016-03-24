import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().toLowerCase().split("\\W+");
        ArrayList<String> textList = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            textList.add(text[i]);
        }
        Map<Integer, ArrayList<String>> mostFrequent = new HashMap<>();
        int count;
        for (int i = 0; i < text.length; i++) {
            count = Collections.frequency(textList, text[i]);
            if (!mostFrequent.containsKey(count)) {
                mostFrequent.put(count, new ArrayList<>());
                mostFrequent.get(count).add(text[i]);
            } else if (!mostFrequent.get(count).contains(text[i])) {
                mostFrequent.get(count).add(text[i]);
            }
        }
        int maxKey = 0;
        for (Integer integer : mostFrequent.keySet()) {
            if (integer > maxKey) {
                maxKey = integer;
            }
        }
        Collections.sort(mostFrequent.get(maxKey));
        for (String word : mostFrequent.get(maxKey)) {
            System.out.println(word + " -> " + maxKey + " times");
        }
    }
}