package oop.tuan.lab6.ex1_3;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] geyXYZ() {
        return new float[]{super.getX(), super.getY(), getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + getZ();
    }
}
