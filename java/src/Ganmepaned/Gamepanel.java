package Ganmepaned;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Gamepanel extends JFrame {
    //窗口尺寸
    int width=800;
    int height=610;    //指针图片
    Image select=Toolkit.getDefaultToolkit().getImage("images/tank4.png");
    //指针初始纵坐标
    int y=150;
    //添加游戏模式 0 游戏未开始 1.单人模式 2.双人模式
    int satte=0;
    int a=0;

    //窗口启动方法

    public void launch() {
        //标题
        setTitle("白云苍狗坦克大战");
        //窗口大小
        setSize(width,height);
        //使屏幕居中
        setLocationRelativeTo(null);
        //添加关闭事件
        setDefaultCloseOperation(3);
        //用户不能调整窗口大小
        setResizable(false);
        //使窗口可见
        setVisible(true);
        //添加键盘监视器
        this.addKeyListener(new Gamepanel.KeyMonitor());
        //重绘
        while (true){
            repaint();
            try {
                Thread.sleep(25);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    //给窗口上色
    public void paint(Graphics g){
        //设置画笔颜色
        g.setColor(Color.gray);
        //绘制实心矩形填充画布 背景颜色
        g.fillRect(0,0,width,height);
        g.setColor(Color.BLUE);
        //改变字体大小和样式
        g.setFont(new Font("黑体",Font.BOLD,50));
        // satte=0 游戏未开始
        if (satte==0){
            //添加文字
            g.drawString("选择游戏模式",220,100);
            g.drawString("单人模式",220,200);
            g.drawString("双人模式",220,300);
            //绘制指针
            g.drawImage(select,160,y,null);
        }else if (satte==1||satte==2){
            g.drawString("游戏开始",220,100);
        }if (satte==1){
            g.drawString("单人模式",220,200);
        }else {
            g.drawString("双人模式",220,300);
        }
    }
    //键盘监视器
    class KeyMonitor extends KeyAdapter {
        //按下键盘
        @Override
        public void keyPressed(KeyEvent e) {
            //返回建值
           int key=e.getKeyCode();
           switch (key){
               case KeyEvent.VK_1:a=1;y=150;
                   break;
               case KeyEvent.VK_2:a=2;y=250;
                   break;
               case KeyEvent.VK_ENTER:
                   satte=a;
                   break;
           }
        }
    }
    public static void main(String[] args) {
        Gamepanel gamepanel = new Gamepanel();
        gamepanel.launch();
    }
}
