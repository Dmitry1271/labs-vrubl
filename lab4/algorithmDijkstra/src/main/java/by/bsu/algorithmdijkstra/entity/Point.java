package by.bsu.algorithmdijkstra.entity;

/**
 * Created by cplus on 09.11.2017.
 */
public class Point extends java.awt.Point {
    private boolean visited;

    public Point() {
    }

    public Point(int x, int y) {
        super(x, y);
    }

    public Point(int x, int y, boolean visited) {
        super(x, y);
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Point point = (Point) o;

        return visited == point.visited;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (visited ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "visited=" + visited +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

