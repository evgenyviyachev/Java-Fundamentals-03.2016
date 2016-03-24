import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        ArrayList<ArrayList<Integer>> increasingSequences = new ArrayList<>();
        int count = 0;
        increasingSequences.add(new ArrayList<>());
        increasingSequences.get(0).add(numbers.get(0));
        for (int i = 0; i < input.length - 1; i++) {
            if (numbers.get(i) < numbers.get(i + 1)) {
                increasingSequences.get(count).add(numbers.get(i + 1));
            } else {
                count++;
                increasingSequences.add(new ArrayList<>());
                increasingSequences.get(count).add(numbers.get(i + 1));
            }
        }
        for (ArrayList<Integer> increasingSequence : increasingSequences) {
            for (Integer integer : increasingSequence) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        int maxSequence = 0;
        ArrayList<Integer> maxSequenceArray = new ArrayList<>();
        for (int i = 0; i < increasingSequences.size(); i++) {
            if (increasingSequences.get(i).size() > maxSequence) {
                maxSequenceArray = increasingSequences.get(i);
                maxSequence = increasingSequences.get(i).size();
            }
        }
        System.out.print("Longest: ");
        for (Integer integer : maxSequenceArray) {
            System.out.print(integer + " ");
        }
    }
}