package train.search.linearsearch;

public class LinearSearch {
    public int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 3, 9, 2, 4, 7, 5};
        System.out.println(new LinearSearch().search(array, 4));
    }
}
