import java.util.Objects;

class MyHashMap<K, V> {

    // Node represents each entry
    static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] buckets;
    private int capacity = 16;

    public MyHashMap() {
        buckets = new Node[capacity];
    }

    // hash function
    private int getIndex(K key) {
        int hash = key.hashCode();
        return Math.abs(hash % capacity);
    }

    // PUT operation
    public void put(K key, V value) {
        int index = getIndex(key);

        Node<K, V> head = buckets[index];

        // check if key already exists
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value; // update value
                return;
            }
            head = head.next;
        }

        // insert new node at bucket
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // GET operation
    public V get(K key) {
        int index = getIndex(key);

        Node<K, V> head = buckets[index];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }
}