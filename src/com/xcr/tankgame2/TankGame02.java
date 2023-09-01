package com.xcr.tankgame2;

import javax.swing.*;
import java.awt.*;

/**
 * @author Changrui Xu
 * @version 1.0
 */
public class TankGame02 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }

    public TankGame02() throws HeadlessException {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(mp);
    }
}
