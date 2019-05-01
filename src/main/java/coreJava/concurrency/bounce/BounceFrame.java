/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package coreJava.concurrency.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author catherine
 * @version $Id: BounceFrame.java, v 0.1 2019年04月26日 11:32 catherine Exp $
 */
public class BounceFrame extends JFrame {

    private BallComponent comp;
    public static final int STEPS = 1000;
    public static final int DELAY = 10;

    public BounceFrame(){
        setTitle("BounceTest");

         comp = new BallComponent();
         add(comp,BorderLayout.CENTER);
         JPanel buttonPanel = new JPanel();
         addButton(buttonPanel, "START", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 addBall();
             }
         });

         addButton(buttonPanel, "Close", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });

         add(buttonPanel,BorderLayout.SOUTH);
         pack();

    }

    public void addButton(Container c, String title , ActionListener listener){
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall(){
        Ball ball = new Ball();
        comp.add(ball);

        //for(int i = 1; i <= STEPS; i++){
        //    ball.move(comp.getBounds());
        //    comp.paint(comp.getGraphics());
        //    try {
        //        Thread.sleep(DELAY);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //}

        Runnable r = () -> {

            for(int i = 1; i <= STEPS; i++){
                ball.move(comp.getBounds());
                comp.repaint();
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Thread t = new Thread(r);
        t.start();
    }

}