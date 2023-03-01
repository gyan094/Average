import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!isPowerOfTwo(a[i])) {
                sum += a[i];
                count++;
            }
        }
        int average = (int) Math.floor((double) sum / count);
        System.out.println(average);
    }

    private static boolean isPowerOfTwo(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }
}
