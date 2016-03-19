import java.util.Scanner;

public class SortArrayOfStrings {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] names = new String[n];
		for (int i = 0; i < n; i++) {
			names[i] = scanner.nextLine();
		}
		
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (names[i-1].compareTo(names[i])>0) {
					String temp;
					temp=names[i-1];
					names[i-1]=names[i];
					names[i]=temp;
					swapped = true;
				}				
			}
			
		} while (swapped);
		
		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}
	}
}