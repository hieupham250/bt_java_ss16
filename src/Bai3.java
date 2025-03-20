import java.util.ArrayList;
import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int max = numbers.getFirst();
        int min = numbers.getFirst();

        for (int number : numbers) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        System.out.println("Phần tử lớn nhất: " + max + ", phần tử nhỏ nhất: " + min);
    }
}
