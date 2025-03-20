import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "pear", "kiwi", "grape"));
        System.out.println("Danh sách ban đầu:");
        System.out.println(words);
        words.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println("Danh sách sau khi sắp xếp:");
        System.out.println(words);
    }
}