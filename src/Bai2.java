import java.util.ArrayList;
import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Danh sách trước khi xóa:");
        for(Integer number : numbers) {
            System.out.println(number);
        }

        numbers.removeIf(number -> number % 3 == 0);

        System.out.println("Danh sách sau khi xóa");
       for(Integer number : numbers) {
           System.out.println(number);
       }
    }
}
