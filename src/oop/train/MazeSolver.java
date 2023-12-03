package oop.train;
import java.util.Stack;

enum Direction {Up, Left, Down, Right, NoDir}

class Coordinate {
    int x, y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate move(Direction direction) {
        switch (direction) {
            case Up:
                return new Coordinate(x, y - 1);
            case Left:
                return new Coordinate(x - 1, y);
            case Down:
                return new Coordinate(x, y + 1);
            case Right:
                return new Coordinate(x + 1, y);
            default:
                return this;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coordinate that = (Coordinate) obj;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}

public class MazeSolver {
    private static final int N = 5; // Độ dài/chiều dài mê cung
    private static final int M = 5; // Chiều rộng mê cung

    private int[][] maze = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0}
    };

    private Stack<Coordinate> path = new Stack<>();
    private boolean done = false;

    private static final Direction[] directions = {Direction.Up, Direction.Left, Direction.Down, Direction.Right};

    public MazeSolver() {
        Coordinate start = new Coordinate(0, 0); // Điểm S ở cột đầu
        Coordinate end = new Coordinate(4, 0); // Điểm E ở cột cuối

        path.push(start);
        solveMaze(end);
        printPath();
    }

    private void solveMaze(Coordinate end) {
        while (!path.isEmpty() && !done) {
            Coordinate curSq = path.peek();
            Direction newDir = getUnvisitedDir(curSq);

            if (newDir == Direction.NoDir) {
                path.pop(); // Ngõ cụt, quay lại ô trước đó trong stack
            } else {
                Coordinate newSq = curSq.move(newDir);

                // Kiểm tra nếu newSq đã nằm trong path để tránh vòng lặp vô hạn
                if (!path.contains(newSq)) {
                    path.push(newSq);

                    if (newSq.equals(end)) { // Đã đến đích!
                        done = true;
                    }
                }
            }
        }
    }

    private Direction getUnvisitedDir(Coordinate curSq) {
        for (Direction dir : directions) {
            Coordinate newSq = curSq.move(dir);
            if (isValid(newSq) && maze[newSq.y][newSq.x] == 0) {
                return dir;
            }
        }
        return Direction.NoDir;
    }

    private boolean isValid(Coordinate coordinate) {
        return coordinate.x >= 0 && coordinate.x < M && coordinate.y >= 0 && coordinate.y < N;
    }

    private void printPath() {
        System.out.println("Path from start to end:");
        for (Coordinate coord : path) {
            System.out.println("(" + coord.x + ", " + coord.y + ")");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Chương trình đang chạy...");
        new MazeSolver();
    }
}
