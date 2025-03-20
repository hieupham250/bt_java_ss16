import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1, 4, 5, 1, 2, 3, 4, 4));
        List<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Danh sách sau khi loại bỏ trùng lặp:");
        System.out.println(uniqueNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }
}