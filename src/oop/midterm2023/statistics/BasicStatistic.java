package oop.midterm2023.statistics;

import java.util.Arrays;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        /* TODO */
    }

    public void setDataSet(DataSet dataSet) {
        /* TODO */
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        /* TODO */
        return dataSet.size();
    }

    @Override
    public double max() {
        /* TODO */
        double max = Double.MIN_VALUE;
        for (int index = 0; index < dataSet.size(); index++) {
            if (dataSet.element(index) > max) {
                max = dataSet.element(index);
            }
        }
        return max;
    }

    @Override
    public double min() {
        /* TODO */
        double min = Double.MAX_VALUE;
        for (int index = 0; index < dataSet.size(); index++) {
            if (dataSet.element(index) < min) {
                min = dataSet.element(index);
            }
        }
        return min;
    }

    @Override
    public double mean() {
        /* TODO */
        double sum = 0;
        for (int index = 0; index < dataSet.size(); index++) {
            sum += dataSet.element(index);
        }
        return sum / dataSet.size();
    }

    @Override
    public double variance() {
        /* TODO */
        double mean = mean();
        double sum = 0;
        for (int index = 0; index < dataSet.size(); index++) {
            double number = dataSet.element(index);
            sum += Math.pow(number - mean, 2);
        }
        return sum / dataSet.size();
    }

    @Override
    public double[] rank() {
        /* TODO */
        double[] result = new double[dataSet.size()];

        for (int i = 0; i < dataSet.size(); i++) {
            int r = 1, s = 1;
            for (int j = 0; j < dataSet.size(); j++) {
                if (j != i && dataSet.element(j) < dataSet.element(i)) {
                    r++;
                }
                if (j != i && dataSet.element(j) == dataSet.element(i)) {
                    s++;
                }
            }
            result[i] = r + (s - 1) / 2.0;
        }

        return result;
    }

    @Override
    public double median() {
        /* TODO */
        double[] tempData = dataSet.elements(0, dataSet.size());
        Arrays.sort(tempData);
        int middle = dataSet.size() / 2;
        if (dataSet.size() % 2 == 1) {
            return tempData[middle];
        }
        return (tempData[middle] + tempData[middle - 1]) / 2;
    }
}
