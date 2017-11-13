package by.bsu.algorithmdijkstra.drawer.action;

import drawer.action.LineAngle;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by cplus on 12.11.2017.
 */
public class LineAngleTest {
    @Test
    public void getAngleTest1() {
        double actual = Math.toDegrees(LineAngle.getAngle(5, 5, 10, 10));
        double expected = 45;
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void getAngleTest2() {
        double actual = Math.toDegrees(LineAngle.getAngle(80, 80, 40, 120));
        double expected = 135;
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void getAngleTest3() {
        double actual = Math.toDegrees(LineAngle.getAngle(50, 50, 10, 10));
        double expected = 225;
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void getAngleTest4() {
        double actual = Math.toDegrees(LineAngle.getAngle(200, 200, 300, 100));
        double expected = 315;
        Assert.assertEquals(expected, actual, 1);
    }
}
