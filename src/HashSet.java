public class HashSet {
    public boolean[] bool;

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.remove(1);
        System.out.println(hs.contains(1));

    }

    public HashSet() {
        bool = new boolean[1000001];
    }

    public void add(int key) {
        bool[key] = true;

    }

    public void remove(int key) {
        bool[key] = false;
    }

    public boolean contains(int key) {
            return bool[key];
    }
}
