package test;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王阔
 * 2024/9/30 下午5:00
 */
//JFrame 相当于一个窗口，是一个画框
public class draw extends JFrame {
    //定义一个面板
    private MyPenel mp;
    public static void main(String[] args) {
        new draw();
    }

    public draw(){//构造器
        //初始化面板
        mp = new MyPenel();
        //把面板放入到窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(400,300);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当关闭窗口时，退出程序
        this.setVisible(true);//可以显示
    }
}

class MyPenel extends JPanel {

    //Mypenel 对象就是一个画板
    // Graphics g 就是一个画笔
    //Graphics 提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法，保留
        g.drawOval(10,10,100,100);
        Image image = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/bomb_1.gif"));
        g.drawImage(image, 10, 10, 200, 200, this);
    }
}
