import java.util.*;

public class GUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String patternLine = "[A-Z][A-Za-z0-9]+\\s\\|\\s[A-Z][A-Za-z0-9]+\\s\\|\\s[A-Z][A-Za-z0-9]+";
        HashMap<String, HashMap<String, LinkedList<String>>> data = new HashMap<>();
        while (!s.equals("It's testing time!")) {
            if (!s.matches(patternLine)) {
                s = scanner.nextLine();
                continue;
            }
            String[] input = s.split("\\s\\|\\s");
            String className = input[0];
            String methodName = input[1];
            String unitTestName = input[2];
            if (!data.containsKey(className)) {
                data.put(className, new HashMap<>());
                data.get(className).put(methodName, new LinkedList<>());
                data.get(className).get(methodName).add(unitTestName);
            } else if (!data.get(className).containsKey(methodName)) {
                data.get(className).put(methodName, new LinkedList<>());
                data.get(className).get(methodName).add(unitTestName);
            } else if (!data.get(className).get(methodName).contains(unitTestName)) {
                data.get(className).get(methodName).add(unitTestName);
            }
            s = scanner.nextLine();
        }
        for (String classData : data.keySet()) {
            for (String method : data.get(classData).keySet()) {
                data.get(classData).get(method).sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
            }
        }
        data.entrySet().stream().sorted((e1, e2) -> {
            int totalTests1 = 0;
            int totalTests2 = 0;
            for (String method : data.get(e1.getKey()).keySet()) {
                totalTests1 += data.get(e1.getKey()).get(method).size();
            }
            for (String method : data.get(e2.getKey()).keySet()) {
                totalTests2 += data.get(e2.getKey()).get(method).size();
            }
            int totalMethods1 = data.get(e1.getKey()).size();
            int totalMethods2 = data.get(e2.getKey()).size();
            if (totalTests1 == totalTests2) {
                if (totalMethods1 == totalMethods2) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return Integer.compare(totalMethods1, totalMethods2);
            }
            return Integer.compare(totalTests2, totalTests1);
        }).forEach(entry -> {
            System.out.println(entry.getKey() + ":");
            data.get(entry.getKey()).entrySet().stream().sorted((e1, e2) -> {
                int totalTests1 = e1.getValue().size();
                int totalTests2 = e2.getValue().size();
                if (totalTests1 == totalTests2) {
                    e1.getKey().compareTo(e2.getKey());
                }
                return Integer.compare(totalTests2, totalTests1);
            }).forEach(method -> {
                System.out.println("##" + method.getKey());
                for (String unitTest : data.get(entry.getKey()).get(method.getKey())) {
                    System.out.println("####" + unitTest);
                }
            });
        });
    }
}