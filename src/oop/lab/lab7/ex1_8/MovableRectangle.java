package oop.lab.lab7.ex1_8;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    }

    private boolean isPointSameSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed) &&
                (topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public void moveUp() {
        if (!isPointSameSpeed()) {
            return;
        }
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        if (!isPointSameSpeed()) {
            return;
        }
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += topLeft.ySpeed;
    }

    @Override
    public void moveLeft() {
        if (!isPointSameSpeed()) {
            return;
        }
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        if (!isPointSameSpeed()) {
            return;
        }
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    public String toString() {
        return "topLeft[" + topLeft.toString() + "], bottomRight[" + bottomRight.toString() + "]";
    }
}
