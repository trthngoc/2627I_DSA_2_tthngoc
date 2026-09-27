import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualStacks {
    ArrayList<Integer> stack1;
    ArrayList<Integer> stack2;
    ArrayList<Integer> stack3;
    public EqualStacks(int[] h1, int[] h2, int[] h3) {
        this.stack1 = new ArrayList<>();
        for (int i : h1) {
            this.stack1.add(i);
        }
        this.stack2 = new ArrayList<>();
        for (int i : h2) {
            this.stack2.add(i);
        }
        this.stack3 = new ArrayList<>();
        for (int i : h3) {
            this.stack3.add(i);
        }
    }

    public int equalStacks() {
        int sum1 = stack1.stream().mapToInt(Integer::intValue).sum();
        int sum2 = stack2.stream().mapToInt(Integer::intValue).sum();
        int sum3 = stack3.stream().mapToInt(Integer::intValue).sum();

        while (true) {
            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }

            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= stack1.remove(0);
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= stack2.remove(0);
            } else {
                sum3 -= stack3.remove(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int[] h1 = new int[n1];
        int[] h2 = new int[n2];
        int[] h3 = new int[n3];
        for (int i = 0; i < n1; i++) {
            h1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            h2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            h3[i] = scanner.nextInt();
        }
        scanner.close();

        EqualStacks equalStacks = new EqualStacks(h1, h2, h3);
        int result = equalStacks.equalStacks();
        System.out.println(result);
    }
}
