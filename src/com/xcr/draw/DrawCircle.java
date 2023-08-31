package com.xcr.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author Changrui Xu
 * @version 1.0
 * 演示如何在面板上画出圆形
 */
public class DrawCircle extends JFrame{//画框
    private MyPanel mp= null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() throws HeadlessException {//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入画框
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//1.先定义一个MyPanel,继承JPanel类，画图形就是在面板上面画
class MyPanel extends JPanel {

    //1.MyPanel是一个画板
    //2.Graphics g 是画笔
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类方法初始化

        //g.drawOval(50,50,50,100);
        //g.drawLine(10,10,100,100);
        //g.drawRect(10,10,100,100);
        //g.setColor(Color.CYAN);
        //g.fillRect(10,10,100,100);
        //g.fillOval(10,10,100,100);
        g.setColor(Color.CYAN);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("嘻嘻嘻",100,100);//x,y是左下角坐标

    }
}