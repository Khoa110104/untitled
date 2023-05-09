package oop.tuan.homework6.ex1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime();
        System.out.println(myTime);

        myTime.setSecond(16);
        myTime.setMinute(43);
        myTime.setHour(10);
        System.out.println(myTime);
        myTime.setTime(10, 10, 10);
        System.out.println(myTime);
        System.out.println("second = " + myTime.getSecond());
        System.out.println("minute = " + myTime.getMinute());
        System.out.println("hour = " + myTime.getHour());

        myTime.nextHour();
        myTime.nextMinute();
        myTime.nextSecond();
        System.out.println(myTime);

        myTime.previousHour();
        myTime.previousMinute();
        myTime.previousSecond();
        System.out.println(myTime);

    }
}
