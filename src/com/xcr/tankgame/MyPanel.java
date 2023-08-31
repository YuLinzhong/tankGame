package com.xcr.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author Changrui Xu
 * @version 1.0
 * 游戏绘图区域
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充举行

    }
}
