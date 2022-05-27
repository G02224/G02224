package com.gxc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textt {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("白云苍狗");
        Font font = new Font("宋体",Font.BOLD,20);
        Font font2 = new Font("宋体",Font.BOLD,18);
        //菜单栏
        JMenuBar jMenuBar = new JMenuBar();

        //菜单
        JMenu jMenu_wj = new JMenu("文件(F)");
        JMenu jMenu_bj = new JMenu("编辑(E)");
        JMenu jMenu_gs = new JMenu("格式(O)");
        JMenu jMenu_ck = new JMenu("查看(V)");
        JMenu jMenu_bz = new JMenu("帮助(H)");
        jMenu_wj.setFont(font);
        jMenu_bj.setFont(font);
        jMenu_gs.setFont(font);
        jMenu_ck.setFont(font);
        jMenu_bz.setFont(font);

        jMenuBar.add(jMenu_wj);
        jMenuBar.add(jMenu_bj);
        jMenuBar.add(jMenu_gs);
        jMenuBar.add(jMenu_ck);
        jMenuBar.add(jMenu_bz);

        jFrame.add(jMenuBar);
        //二级菜单
        JMenuItem jMenu_wj_xj = new JMenuItem("新建(N)");
        JMenuItem jMenu_wj_xck = new JMenuItem("新窗口(W)");
        JMenuItem jMenu_wj_dk = new JMenuItem("打开(O)");
        JMenuItem jMenu_wj_bc = new JMenuItem("保存(S)");
        JMenuItem jMenu_wj_lcw = new JMenuItem("另存为(A)");
        JMenuItem jMenu_wj_ymsz = new JMenuItem("页面设置(U)");
        JMenuItem jMenu_wj_dy = new JMenuItem("打印(P)");
        JMenuItem jMenu_wj_tc = new JMenuItem("退出(X)");
        jMenu_wj_tc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jMenu_wj_xj.setFont(font2);
        jMenu_wj_xck.setFont(font2);
        jMenu_wj_dk.setFont(font2);
        jMenu_wj_bc.setFont(font2);
        jMenu_wj_lcw.setFont(font2);
        jMenu_wj_ymsz.setFont(font2);
        jMenu_wj_dy.setFont(font2);
        jMenu_wj_tc.setFont(font2);

        jMenu_wj.add(jMenu_wj_xj);
        jMenu_wj.add(jMenu_wj_xck);
        jMenu_wj.add(jMenu_wj_dk);
        jMenu_wj.add(jMenu_wj_bc);
        jMenu_wj.add(jMenu_wj_lcw);
        jMenu_wj.addSeparator();
        jMenu_wj.add(jMenu_wj_ymsz);
        jMenu_wj.add(jMenu_wj_tc);



        jFrame.setSize(800,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
