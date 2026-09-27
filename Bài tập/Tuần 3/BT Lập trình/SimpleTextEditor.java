import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class SimpleTextEditor {
    private StringBuilder text;
    private Stack<String> history;

    public SimpleTextEditor() {
        text = new StringBuilder();
        history = new Stack<>();
    }

    public void append(String str) {
        text.append(str);
        history.push(text.toString());
    }

    public void delete(int k) {
        history.push(text.toString());
        text.delete(text.length() - k, text.length());
    }

    public char print(int k) {
        return text.charAt(k - 1);
    }

    public void undo() {
        if (!history.isEmpty()) {
            text = new StringBuilder(history.pop());
        }
    }

    public static void main(String[] args) {
        SimpleTextEditor editor = new SimpleTextEditor();
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    String str = scanner.next();
                    editor.append(str);
                    break;
                case 2:
                    int k = scanner.nextInt();
                    editor.delete(k);
                    break;
                case 3:
                    int index = scanner.nextInt();
                    result.add(String.valueOf(editor.print(index)));
                    break;
                case 4:
                    editor.undo();
                    break;
            }
        }

        for (String res : result) {
            System.out.println(res);
        }
    }
    
}
