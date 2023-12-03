package hw7_22001603_NguyenDangKhoa.combo2.ex1;

public class LinearSearchArrayList<T> {
    protected SimpleArrayList<T> arrayList;
    protected long runTime;

    public LinearSearchArrayList(SimpleArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public boolean search(T data) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (data.equals(arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }
    public void getRunTime(T data) {
        long start  =System.nanoTime();
        boolean search = search(data);
        long end = System.nanoTime();
        this.runTime = end - start;
        if (search) {
            System.out.println("Tìm thấy phần tử " + data + " mất " + runTime + " ns");
        } else {
            System.out.println("Không tìm thấy phần tử " + data + " mất " + runTime + " ns");

        }
    }
}
