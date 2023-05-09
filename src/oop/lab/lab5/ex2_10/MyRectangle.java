package oop.lab.lab5.ex2_10;


public class MyRectangle {
    private MyPoint a1;
    private MyPoint a2;
    private MyPoint a3;
    private MyPoint a4;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        a1 = new MyPoint(x1, y1);
        a2 = new MyPoint(x2, y2);
        a3 = new MyPoint(x1, y2);
        a4 = new MyPoint(x2, y1);
    }
}

//    public MyRectangle(MyPoint a1, MyPoint a2) {
////        this.a = a;
////        this.b = b;
//    }
//
//    public String toString() {
//        return "MyRectangle[topAndLeft=" + a + ", bottomAndRight=" + b + "]";
//    }
//
//}
