class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class Main_1 {
    public static void main(String[] args) {

        Pair<String, Integer> student = new Pair<>("Faruk", 21);
        Pair<Integer, Double> product = new Pair<>(101, 59.99);

        System.out.println("Student Pair: " + student);
        System.out.println("Product Pair: " + product);

        student.setValue(22);
        System.out.println("Updated Student Pair: " + student);
    }
}