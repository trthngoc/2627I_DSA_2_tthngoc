import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        if (n <= 0 || arr == null || arr.size() != n) {
            return;
        }

        int key = arr.get(n - 1);
        int i = n - 2;
        while (i >= 0 && arr.get(i) > key) {
            arr.set(i + 1, arr.get(i));
            printArray(arr);
            i--;
        }
        arr.set(i + 1, key);
        printArray(arr);
    }

    public static void printArray(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        insertionSort1(n, arr);
        scanner.close();
    }
}