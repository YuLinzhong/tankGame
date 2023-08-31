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
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克右上角y坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     */
    //编写方法，画出坦克
    public void drawTank(int x,int y ,Graphics g, int direct,int type){
        //根据不同类型设置颜色
        switch (type) {
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.ORANGE);
                break;
        }
        switch (direct){
            case 0:
                g.fill3DRect(x,y,10,60,false);//左轮子
                g.fill3DRect(x+30,y,10,60,false);//右轮子
                g.fill3DRect(x+10,y+10,20,40,false);//车身
                g.fillOval(x+10,y+20,20,20);//盖子
                g.drawLine(x+20,y+30,x+20,y);
                break;
            default:

        }
    }
}
