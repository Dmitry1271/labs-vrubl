package by.bsu.widewidthSearch.generate;

import by.bsu.widewidthSearch.drawer.GraphDrawer;

import java.awt.*;
import java.util.Random;

/**
 * Created by cplus on 02.11.2017.
 */
public final class Generator {

    private Generator() {
    }

    public static int generate(int max) {
        return new Random().nextInt(max);
    }

    public static Point generatePoint() {
        return new Point(generate(GraphDrawer.PANEL_WIDTH - 50), generate(GraphDrawer.PANEL_HEIGHT - 50));
    }

    public static Point[] generatePoints(int n) {
        Point[] points = new Point[n];
        for (int i = 0; i < n; ++i) {
            points[i] = generatePoint();
        }
        return points;
    }
}
