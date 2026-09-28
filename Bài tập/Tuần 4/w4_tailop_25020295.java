import java.util.Scanner;
import java.util.ArrayList;

class hIndex {
    int N;
    ArrayList<Integer> list;
    public hIndex(int N, ArrayList<Integer> list) {
        this.N = N;
        this.list = list;
    }

    private void sort() {
        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public int calculate() {
        sort();
        int h = N;
        while (true) {
            if (list.get(N-h) < h) {
                h--;
            } else {
                return h;
            }
        }
    }
}

public class w4_tailop_25020295 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int n=0; n<N; n++) {
            list.add(sc.nextInt());
        }

        hIndex h = new hIndex(N, list);
        System.out.println(h.calculate());
    }
}
