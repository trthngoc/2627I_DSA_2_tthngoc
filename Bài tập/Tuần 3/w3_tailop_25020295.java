import java.util.Stack;
import java.util.Scanner;

public class w3_tailop_25020295 {
    private int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
    private String infixToPostfix(String start) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < start.length(); i++) {
            char c = start.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println("Infix: ");
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        w3_tailop_25020295 obj = new w3_tailop_25020295();
        System.out.println("Postfix: " + obj.infixToPostfix(start));
    }
}