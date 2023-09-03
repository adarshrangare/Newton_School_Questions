// https://my.newtonschool.co/playground/code/ywj2kqcaa3mi
import java.util.*;
 public class GoodNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long k = scanner.nextLong();

        long result = countMultiplesInRange(A, B, k);
        System.out.println(result);
    }

    public static long countMultiplesInRange(long A, long B, long k) {
        long count = 0;

        // Calculate the count of multiples of k in the range [A, B]
        if (A % k == 0) {
            count = (B / k) - (A / k) + 1;
        } else {
            count = (B / k) - (A / k);
        }
        return count;
        }
    }
