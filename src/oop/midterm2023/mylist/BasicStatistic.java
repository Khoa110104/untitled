package oop.midterm2023.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     *
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        double max = Double.MIN_VALUE;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object current = iterator.next();
            if (current instanceof Double) {
                double number = (double) current;
                if (number > max) {
                    max = number;
                }
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     *
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = Double.MAX_VALUE;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object current = iterator.next();
            if (current instanceof Double) {
                double number = (double) current;
                if (number < min) {
                    min = number;
                }
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     *
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double sum = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object current = iterator.next();
            if (current instanceof Double) {
                double number = (double) current;
                sum += number;
            }
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     *
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double mean = mean();
        double sum = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object current = iterator.next();
            if (current instanceof Double) {
                double number = (double) current;
                sum += Math.pow(number - mean, 2);
            }
        }
        return sum / data.size();
    }
}
