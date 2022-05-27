package com.gxc;

import javax.swing.*;


public class text2 extends JFrame {
    public static void main(String[] args) {
        //创建JFrame类窗口并取名
        JFrame jFrame = new JFrame("白云苍狗");
        //窗口长宽大小
        jFrame.setSize(600,400);
        //窗口出现在屏幕上的位置坐标
        jFrame.setLocation(500,200);
        //使窗口居中
        //jFrame.setLocationRelativeTo(null);
        //窗口中组件设置为绝对定位
        jFrame.setLayout(null);
        //创建按钮组件
        JButton jButton = new JButton("白云苍狗");
        //设置按钮组件的大小和位置
        jButton.setBounds(50,30,280,30);
        //把按钮添加到窗口中
        jFrame.add(jButton);
        //关闭窗口同时关闭程序
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗口可见/不可见
        jFrame.setVisible(true);
    }
}
