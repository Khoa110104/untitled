package oop.midterm2023.statistics;

import java.util.Arrays;
import java.util.Random;

public class TestStatistics {
    public static void main(String[] args) {
        /*
        TODO

        I. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho ListDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */

        Statistic statistic = new BasicStatistic();

        // test
        DataSet arrayDataSet = new ArrayDataSet();
        testDataInit(arrayDataSet);
        showDetail(statistic, arrayDataSet);
        DataSet listDataSet = new ListDataSet();
        testDataInit(listDataSet);
        showDetail(statistic, listDataSet);

        // random
//        Random random = new Random();
//        DataSet arrayDataSet = new ArrayDataSet();
//        randomDataInit(arrayDataSet, random);
//        showDetail(statistic, arrayDataSet);
//        DataSet listDataSet = new ListDataSet();
//        randomDataInit(listDataSet, random);
//        showDetail(statistic, listDataSet);
    }

    private static void randomDataInit(DataSet dataSet, Random random) {
        for (int i = 0; i < 4; i++) {
            dataSet.append(random.nextInt(1000) / 100D);
            dataSet.insert(random.nextInt(1000) / 100D, 0);
            dataSet.insert(random.nextInt(1000) / 100D, dataSet.size());
        }
    }

    private static void testDataInit(DataSet dataSet) {
        dataSet.insert(10, 0);
        dataSet.append(15);
        dataSet.insert(12, 1);
        dataSet.append(12);
        dataSet.append(10);
        dataSet.append(15);
        dataSet.append(12);
        dataSet.append(1);
        dataSet.append(2.2);
        dataSet.append(3.3);
    }

    private static void showDetail(Statistic statistic, DataSet dataSet) {
        ((BasicStatistic) statistic).setDataSet(dataSet);
        System.out.println("========================*************===================");
        System.out.println("dataset: " + dataSet);
        System.out.println("size: " + statistic.size());
        System.out.println("max: " + statistic.max());
        System.out.println("min: " + statistic.min());
        System.out.println("mean: " + statistic.mean());
        System.out.println("variance: " + statistic.variance());
        System.out.println("rank: " + Arrays.toString(statistic.rank()));
        System.out.println("median: " + statistic.median());
    }
}
