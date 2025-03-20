import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1, 4, 5, 1, 2, 3, 4, 4));
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> uniqueElements = new ArrayList<>();
        Map<Integer, Integer> duplicateCounts = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            } else {
                duplicateCounts.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Các phần tử xuất hiện đúng một lần:");
        System.out.println(uniqueElements);

        System.out.println("Các phần tử bị trùng lặp và số lần xuất hiện:");
        for (Map.Entry<Integer, Integer> entry : duplicateCounts.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
    }
}
