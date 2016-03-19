import java.util.Scanner;

public class PointsInside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.next());
        double y = Double.parseDouble(scanner.next());

        if ((12.5<=x && x<=22.5 && 6<=y && y<=8.5)
                || (12.5<=x && x<=17.5 && 8.5<=y && y<=13.5)
                || (20<=x && x<=22.5 && 8.5<=y && y<=13.5)){
            System.out.println("Inside");
        }else{
            System.out.println("Outside");
        }
    }
}