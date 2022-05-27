package com.gxc;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class text3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("白云苍狗");
        jFrame.setSize(600,400);
        jFrame.setLocation(500,200);
        jFrame.setLayout(null);
        //创建接收图片的对象
        final JLabel jl=new JLabel();
        //创建图片
        ImageIcon imageIcon = new ImageIcon("E:\\Iron2.jpeg");
        //接收图片
            jl.setIcon(imageIcon);
            //给图片大小出现位置初始化
            jl.setBounds(50,50,imageIcon.getIconWidth(),imageIcon.getIconHeight());
        JButton jButton = new JButton("隐藏图片");
        JButton jButton2 = new JButton("显示图片");
        jButton.setBounds(400,310,100,30);
        //给按钮添加监听事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jl.setVisible(false);
                jButton.setVisible(false);
                jButton2.setVisible(true);
            }
        });
        jButton2.setBounds(400,310,100,30);
        //给按钮添加监听事件
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jl.setVisible(true);
                jButton.setVisible(true);
                jButton2.setVisible(false);
            }
        });
        jFrame.add(jl);
        jFrame.add(jButton);
        jFrame.add(jButton2);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
