import java.util.ArrayList;
import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;
        for(Integer number : numbers) {
            sum += number;
        }
        System.out.println("Tổng các phẩn tử: " + sum);
    }
}
