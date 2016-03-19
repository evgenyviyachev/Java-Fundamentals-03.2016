import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] names = new String[n];
		for (int i = 0; i < n; i++) {
			names[i] = scanner.nextLine();
		}
		Arrays.sort(names);
		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}
	}
}