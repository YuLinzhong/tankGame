package com.xcr.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Changrui Xu
 * @version 1.0
 * 演示小球通过键盘控制上下左右讲解Java的事件控制
 */
public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() throws HeadlessException {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //窗口JFrame对象可以监听键盘事件，即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//KeyListener是监听器
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);

    }

    //有字符输出时，该方法触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下，该方法触发
    @Override
    public void keyPressed(KeyEvent e) {
        //在java中会给每个键有一个值int
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {//向下的箭头对应的code值
            y++;//更新坐标
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        }
        this.repaint();
    }

    //当某个键松开，该方法触发
    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println((char) e.getKeyCode() + "被按下");
    }
}
