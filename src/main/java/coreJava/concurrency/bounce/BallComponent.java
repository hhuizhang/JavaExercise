/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package coreJava.concurrency.bounce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author catherine
 * @version $Id: BallComponent.java, v 0.1 2019年04月26日 15:18 catherine Exp $
 */
public class BallComponent extends JPanel {

    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 350;

    private java.util.List<Ball> balls = new ArrayList<>();

    public void add(Ball b){
        balls.add(b);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Ball b : balls){
            g2.fill(b.getShape());
        }

    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}