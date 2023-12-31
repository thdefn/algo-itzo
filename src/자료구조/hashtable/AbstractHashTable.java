package 자료구조.hashtable;

public abstract class AbstractHashTable<K, V> implements HashTable<K, V> {
    static class Entry<K, V> implements HashTable.Entry<K, V> {
        K key;
        V value;
        boolean isDeleted;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            isDeleted = false;
        }

        public Entry() {
            this.key = null;
            this.value = null;
            isDeleted = true;
        }
    }
}
