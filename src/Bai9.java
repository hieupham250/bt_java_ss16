import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các số nguyên, cách nhau bởi dấu cách:");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }

        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            } else if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        System.out.println("Số chẵn: " + evenNumbers);
        System.out.println("Số lẻ: " + oddNumbers);
        System.out.println("Số nguyên tố: " + primeNumbers);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
