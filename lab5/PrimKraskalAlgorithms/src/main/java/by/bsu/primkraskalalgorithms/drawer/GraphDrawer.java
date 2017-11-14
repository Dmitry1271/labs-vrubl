package by.bsu.primkraskalalgorithms.drawer;

import by.bsu.primkraskalalgorithms.algorithm.PrimAlgorithm;
import by.bsu.primkraskalalgorithms.entity.Graph;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cplus on 09.11.2017.
 */
public class GraphDrawer extends JPanel {
    public static final int PANEL_WIDTH = 700;
    public static final int PANEL_HEIGHT = 700;
    public static final int START_VERTEX_FOR_PRIM_ALGORITHM = 1;

    private Graph graph;
    private JFrame frame = new JFrame();
    private PrimAlgorithm primAlgorithm;

    public GraphDrawer() {
    }

    public GraphDrawer(Graph graph) {
        this.graph = graph;
        primAlgorithm = new PrimAlgorithm(graph);
        primAlgorithm.doAlgorithm(START_VERTEX_FOR_PRIM_ALGORITHM);

        System.out.println(primAlgorithm.getResult());
        System.out.println(primAlgorithm.getResultVertexes());
        System.out.println(primAlgorithm.getTreeWeight());
    }

    public void draw() {
        frame.setLocation(150, 0);
        frame.setMinimumSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        DrawHelper.drawGraph(graphics, graph);
        DrawHelper.drawAlgorithmResult(graphics, primAlgorithm.getResult(), graph);

    }
}
