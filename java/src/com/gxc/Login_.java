package com.gxc;

import javax.swing.*;
import java.awt.*;

public class Login_ {
    public static void main(String[] args) {
        new Gamepanel().launch();
    }
}
class Gamepanel extends JFrame {
    //窗口尺寸
    int width=800;//宽
    int height=500;//高
    //窗口启动方法
    void launch(){
        setTitle("登入界面");//窗口标题
        setSize(width,height);//窗口大小
        setLocationRelativeTo(null);//使窗口居中
        setResizable(false);//使窗口不可改变大小
        setLayout(new FlowLayout());//窗口布局定位
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出窗口就退出程序
        setVisible(true);//使窗口可见

    }
    //设置窗口格式
    public void paint(Graphics g){
        //设置窗口背景图片
        ImageIcon imageIcon = new ImageIcon("E:\\bj.jpeg");
        JLabel bjimg = new JLabel();
    }
}