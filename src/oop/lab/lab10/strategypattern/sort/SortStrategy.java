package oop.lab.lab10.strategypattern.sort;

public class SortStrategy {
//    public static SortStrategy instance;

    private ISort sortee;

    public SortStrategy() {

    }

//    public static SortStrategy getInstance() {
//        if (instance == null) {
//            instance = new SortStrategy();
//        }
//        return instance;
//    }

    public void setSortee(ISort sortee) {
        this.sortee = sortee;
    }

    public int sort(int[] data) {
        return sortee.sort(data);
    }
}
