import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		//int a = Integer.parseInt(args[0]);
		//int b = Integer.parseInt(args[1]);
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+b);
		scanner.close();
	}
}