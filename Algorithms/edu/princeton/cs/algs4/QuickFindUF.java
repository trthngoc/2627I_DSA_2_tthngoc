public class QuickFindUF {
    private int[] id;
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public void union(int p, int q) {
        // int pid = id[p];
        // int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id[p]) id[i] = id[q];
        }
    }
    public int find(int p) {
        return id[p];
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF(5);
        uf.union(0, 1);
        uf.union(0, 2);
        System.out.println(uf.connected(0, 2)); // true
        System.out.println(uf.connected(1, 2)); // false
    }
}