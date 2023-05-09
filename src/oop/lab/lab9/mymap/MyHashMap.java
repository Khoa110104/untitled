package oop.lab.lab9.mymap;

public class MyHashMap implements MyMap {
    MyHashMapEntry[] table;
    final static int INITIAL_SIZE = 8;
    int size;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    public MyHashMap(MyHashMapEntry[] table, int size) {
        this.table = table;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            table[bucket] = null;
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        return table[getBucket(key)] != null;
    }

    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getKey();
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getKey()));
            }
        }
        return sb.toString();
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio()  {
        return size / (double) table.length;
    }

    void enlarge() {
        MyHashMapEntry[] temp = new MyHashMapEntry[table.length * 2];
        System.arraycopy(table, 0, temp, 0, table.length);
        table = temp;

    }
}
