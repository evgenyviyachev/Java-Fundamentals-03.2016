import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();
        for (int i = (int)Math.pow(10,length-1); i >= 1; i/=10) {
            int digit = number/i;
            String name="";
            switch (digit){
                case 0:
                    name="Gee";
                    break;
                case 1:
                    name="Bro";
                    break;
                case 2:
                    name="Zuz";
                    break;
                case 3:
                    name="Ma";
                    break;
                case 4:
                    name="Duh";
                    break;
                case 5:
                    name="Yo";
                    break;
                case 6:
                    name="Dis";
                    break;
                case 7:
                    name="Hood";
                    break;
                case 8:
                    name="Jam";
                    break;
                case 9:
                    name="Mack";
                    break;
                default:
                    break;
            }
            System.out.print(name);
            number = number%i;
        }
        System.out.println();
    }
}
