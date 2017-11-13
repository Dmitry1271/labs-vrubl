package by.bsu.algorithmdijkstra.drawer;

import by.bsu.algorithmdijkstra.entity.Graph;
import by.bsu.algorithmdijkstra.drawer.action.LineAngle;

import java.awt.*;

/**
 * Created by cplus on 09.11.2017.
 */
public class DrawHelper {
    public static final int DIAM = 8;
    public static final int TEXT_INDENT = 10;
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
            graphics.drawString("" + (i + 1), points[i].x + TEXT_INDENT, points[i].y + TEXT_INDENT);
        }
    }

    private static void drawLines(Graphics graphics, Graph graph) {
        int size = graph.getMatrix().length;
        Point[] points = graph.getPoints();
        int[][] matrix = graph.getMatrix();

        for (int i = 1; i < size; ++i) {
            for (int j = 0; j < i; ++j) {
                if (matrix[i][j] > 0) {
                    graphics.setColor(Color.black);
                    graphics.drawLine(points[i].x + DIAM / 2, points[i].y + DIAM / 2, points[j].x + DIAM / 2, points[j].y + DIAM / 2);
                    drawArrowLines(points[j].x + DIAM / 2, points[j].y + DIAM / 2, points[i].x + DIAM / 2, points[i].y + DIAM / 2, graphics);
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


}
