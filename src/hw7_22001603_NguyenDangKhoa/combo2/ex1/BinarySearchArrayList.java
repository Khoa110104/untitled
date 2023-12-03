package hw7_22001603_NguyenDangKhoa.combo2.ex1;

public class BinarySearchArrayList<T extends Comparable<T>> {
    protected SimpleArrayList<T> arrayList;
            ;
    protected long runTime;

    public BinarySearchArrayList(SimpleArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
    private boolean binarySearch(T data, int startIndex, int endIndex) {
        if (arrayList.get(startIndex).equals(data) || arrayList.get(endIndex).equals(data))
            return true;
        else if (startIndex == endIndex)
            return false;
        else {
            int middleIndex = (startIndex + endIndex) / 2;
            if (arrayList.get(middleIndex).equals(data))
                return true;
            else if (data.compareTo(arrayList.get(middleIndex)) < 0) {
                middleIndex--;
                return binarySearch(data, startIndex, middleIndex);
            } else if (data.compareTo(arrayList.get(middleIndex)) > 0) {
                middleIndex++;
                return binarySearch(data, middleIndex, endIndex);
            }
        }
        return false;
    }
    private boolean binarySearch(T data) {
        return binarySearch(data, 0, arrayList.size()-1);
    }
    public void getRunTime(T data) {
        long start  =System.nanoTime();
        boolean search = binarySearch(data);
        long end = System.nanoTime();
        this.runTime = end - start;
        if (search) {
            System.out.println("Tìm thấy phần tử " + data + " mất " + runTime + " ns" );
        } else {
            System.out.println("Không tìm thấy phần tử " + data + " mất " + runTime + " ns" );

        }
    }
}
