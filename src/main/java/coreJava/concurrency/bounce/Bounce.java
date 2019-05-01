/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package coreJava.concurrency.bounce;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author catherine
 * @version $Id: Bounce.java, v 0.1 2019年04月26日 11:30 catherine Exp $
 */
public class Bounce {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}