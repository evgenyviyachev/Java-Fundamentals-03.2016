import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        scanner.nextLine();
        TreeMap<String, Integer> nameDuration = new TreeMap<>();
        TreeMap<String, ArrayList<String>> nameIPs = new TreeMap<>();
        for (int i = 0; i < lines; i++) {
            String[] temp = scanner.nextLine().split(" ");
            if (!nameDuration.containsKey(temp[1])) {
                nameDuration.put(temp[1], Integer.parseInt(temp[2]));
            } else {
                nameDuration.put(temp[1], nameDuration.get(temp[1]) + Integer.parseInt(temp[2]));
            }
            if (!nameIPs.containsKey(temp[1])) {
                nameIPs.put(temp[1], new ArrayList<>());
                nameIPs.get(temp[1]).add(temp[0]);
            } else if (nameIPs.containsKey(temp[1]) && !nameIPs.get(temp[1]).contains(temp[0])) {
                nameIPs.get(temp[1]).add(temp[0]);
            }
        }
        for (ArrayList<String> IPs : nameIPs.values()) {
            Collections.sort(IPs);
        }
        for (String name : nameIPs.keySet()) {
            System.out.println(name + ": " + nameDuration.get(name) + " " + nameIPs.get(name));
        }
    }
}