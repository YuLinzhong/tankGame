package com.xcr.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Changrui Xu
 * @version 1.0
 * 游戏绘图区域
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(2);//设置速度，默认为1
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充举行
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
    }

    /**
     * @param x      坦克左上角x坐标
     * @param y      坦克右上角y坐标
     * @param g      画笔
     * @param direct 坦克方向
     * @param type   坦克类型
     */
    //编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型设置颜色
        switch (type) {
            case 0: //敌人坦克
                g.setColor(Color.CYAN);
                break;
            case 1: //我方坦克
                g.setColor(Color.ORANGE);
                break;
        }
        switch (direct) {
            //0 1 2 3分别表示向上 右 下 左 即顺时针
            case 0://上
                g.fill3DRect(x, y, 10, 60, false);//左轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//车身
                g.fillOval(x + 10, y + 20, 20, 20);//盖子
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://右
                g.fill3DRect(x, y, 60, 10, false);//左轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//车身
                g.fillOval(x + 20, y + 10, 20, 20);//盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://下
                g.fill3DRect(x, y, 10, 60, false);//左轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//车身
                g.fillOval(x + 10, y + 20, 20, 20);//盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://左
                g.fill3DRect(x, y, 60, 10, false);//左轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//车身
                g.fillOval(x + 20, y + 10, 20, 20);//盖子
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wsad键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            hero.setDirect(0);
            hero.moveUp();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            hero.setDirect(2);
            hero.moveDown();
        }else if(e.getKeyCode() == KeyEvent.VK_A){
            hero.setDirect(3);
            hero.moveLeft();
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirect(1);
            hero.moveRight();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
