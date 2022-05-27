package com.gxc;

import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {
        new Login().launch();
    }
    public void launch(){
        //窗口界面
        Login login = new Login();
        JFrame jFrame = new JFrame("登入界面");
        jFrame.setSize(800,500);//窗口大小
        jFrame.setLocationRelativeTo(null);//使窗口居中
        jFrame.setResizable(false);//使窗口不可改变大小
        jFrame.setLayout(new FlowLayout());//窗口布局定位
        //设置文字
        JLabel title = new JLabel("学生信息管理系统");
        Font font = new Font("宋体",Font.BOLD,25);//文字大小
        title.setFont(font);
        //添加背景图片
        final JLabel jl=new JLabel();
        ImageIcon imageIcon = new ImageIcon("E:\\bj.jpeg");
        jl.setIcon(imageIcon);
        jl.setBounds(0,0,imageIcon.getIconWidth(),imageIcon.getIconHeight());

        jFrame.add(jl);
        jFrame.add(title);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
