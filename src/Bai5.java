import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1, 4, 5, 1, 2, 3, 4, 4));
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Số lần xuất hiện của từng phần tử:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " lần");
        }
    }
}
