package bounce2;

import bounce.Ball;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BallComponent extends JPanel {
    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 350;

    private java.util.List<Ball> balls = new ArrayList<>();

    /**
     * Add a ball to the component.
     * @param ball
     */
    public void add(Ball ball) {
        balls.add(ball);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);    // erase background
        Graphics2D g2 = (Graphics2D) g;
        for (Ball b : balls) {
            g2.fill(b.getSharpe());
        }
    }
}
