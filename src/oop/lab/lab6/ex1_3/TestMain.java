package oop.lab.lab6.ex1_3;

public class TestMain {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString()
        Point2D point2D = new Point2D(4, 5);
        System.out.println(point2D);

        //BasicStatistics getter ang setter
        point2D.setX(2);
        point2D.setY(3);
        System.out.println("x = " + point2D.getX());
        System.out.println("y = " + point2D.getY());

        Point2D point2D1 = new Point2D(1, 2);
        System.out.println(point2D1.getXY()[0]);
        System.out.println(point2D1.getXY()[1]);

        //BasicStatistics constructor and toString()
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        //BasicStatistics getter and setter
        point3D.setXYZ(7, 8, 9);
        System.out.println("x = " + point3D.getX());
        System.out.println("y = " + point3D.getY());
        System.out.println("z = " + point3D.getZ());

        Point3D point3D1 = new Point3D(1, 2, 4);
        System.out.println(point3D1.getXYZ()[0]);
        System.out.println(point3D1.getXYZ()[1]);
        System.out.println(point3D1.getXYZ()[2]);
    }
}
