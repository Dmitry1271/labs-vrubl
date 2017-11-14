package by.bsu.algorithmdijkstra.drawer;

import by.bsu.algorithmdijkstra.entity.*;
import by.bsu.algorithmdijkstra.drawer.action.LineAngle;
import by.bsu.algorithmdijkstra.entity.Point;

import java.awt.*;

/**
 * Created by cplus on 09.11.2017.
 */
public class DrawHelper {
    public static final int DIAM = 8;
    public static final int TEXT_INDENT = 15;
    public static final int ARROW_LINE_LENGTH = 12;
    public static final double ARROW_ANGLE = Math.toRadians(15);

    private DrawHelper() {
    }

    public static void drawGraph(Graphics graphics, Graph graph) {
        drawPoints(graphics, graph);
        drawLines(graphics, graph);

    }


    private static void drawPoints(Graphics graphics, Graph graph) {
        int size = graph.getMatrix().length;
        Point[] points = graph.getPoints();
        for (int i = 0; i < size; ++i) {
            graphics.fillOval(points[i].x, points[i].y, DIAM, DIAM);
            graphics.setColor(Color.black);
            graphics.drawString(String.valueOf(i + 1), points[i].x + TEXT_INDENT, points[i].y + TEXT_INDENT);
        }
    }

    private static void drawLines(Graphics graphics, Graph graph) {
        int size = graph.getMatrix().length;
        Point[] points = graph.getPoints();
        int[][] matrix = graph.getMatrix();
        int vertex;

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                vertex = matrix[i][j];
                if (vertex > 0 && vertex < Integer.MAX_VALUE) {
                    graphics.setColor(Color.orange);
                    graphics.drawLine(points[i].x + DIAM / 2, points[i].y + DIAM / 2, points[j].x + DIAM / 2, points[j].y + DIAM / 2);
                    drawArrowLines(points[i].x + DIAM / 2, points[i].y + DIAM / 2, points[j].x + DIAM / 2, points[j].y + DIAM / 2, graphics);
                    drawWeight(graphics, points[i], points[j], vertex);
                }
            }
        }
    }

    private static void drawArrowLines(double x1, double y1, double x2, double y2, Graphics graphics) {
        double angle = LineAngle.getAngle(x2, y2, x1, y1);

        double rotationLeftX = ARROW_LINE_LENGTH * Math.cos(angle - ARROW_ANGLE);
        double rotationRightX = ARROW_LINE_LENGTH * Math.cos(angle + ARROW_ANGLE);
        double rotationLeftY = ARROW_LINE_LENGTH * Math.sin(angle - ARROW_ANGLE);
        double rotationRightY = ARROW_LINE_LENGTH * Math.sin(angle + ARROW_ANGLE);

        graphics.setColor(Color.red);
        graphics.drawLine((int) x2, (int) y2, (int) (x2 + rotationRightX), (int) (y2 + rotationRightY));
        graphics.drawLine((int) x2, (int) y2, (int) (x2 + rotationLeftX), (int) (y2 + rotationLeftY));

    }

    private static void drawWeight(Graphics graphics, Point v1, Point v2, int weight) {
        graphics.setColor(Color.blue);
        int x = (v1.x + v2.x) / 2;
        int y = (v1.y + v2.y) / 2;
        graphics.drawString(String.valueOf(weight), x, y);
    }


}
