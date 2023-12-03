package oop.demofinal2023.integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;

    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int n = 2,iteration = 0;
        double current = 0;
        double before = integrate(poly, lower, upper, n);
        while (iteration < maxIterations) {
            iteration++;
            n = n * 2;
            current = integrate(poly, lower, upper, n);
            if (Math.abs(current - before) < precision) {
                break;
            }
            before = current;
        }
        return current;

    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double c = (upper - lower) / numOfSubIntervals;
        double diff = ((upper - lower) - c * (numOfSubIntervals - 1)) * 0.5;
        double newLow = lower + diff;
        double sum = 0;
        for (int i = 0; i < numOfSubIntervals; i++) {
            double x = newLow + c * i;
            sum = sum + c * poly.evaluate(x);
        }
        return sum;
    }
}
