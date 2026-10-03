import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CountingSort1 {
    public static List<Integer> countingSort1(int n, int[] arr) {
        if (n <= 0 || arr == null || arr.length != n) {
            return new ArrayList<>();
        }

        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            count.add(0);
        }
        for (int num: arr) {
            count.set(num, count.get(num) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> result = countingSort1(n, arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
