import java.util.Scanner;
import java.util.Stack;
import java.util.ArraysList;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqueue(int value) {
        stack1.push(value);
    }
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public int print() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            switch (value) {
                case 1:
                    int enqueueValue = scanner.nextInt();
                    queue.enqueue(enqueueValue);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    result.add(String.valueOf(queue.print()));
                    break;
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
