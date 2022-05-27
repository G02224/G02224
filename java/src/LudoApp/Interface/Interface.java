package LudoApp.Interface;

import Houset.utils.Utility;
import LudoApp.Feattures.LudoFeattures;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Interface {
    public void printLudo(){
        Date date = new Date();
        date.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int count=0;
        int count2=0;
        boolean lop=true;
        Random random=new Random();
        System.out.println("=================飞行棋程序=================");
        System.out.println("创建您的棋子");
        String s = Utility.readString(3);
        System.out.println("规则棋盘一共有67个子,棋子通过摇晃骰子到达终点,骰子为6即可赠送一次摇骰子机会！！！");
        System.out.println("如果超过棋子位置超过67，将会倒退！！！");
        System.out.println("-----棋盘-----");
        LudoFeattures.arr();
        System.out.println();
        LudoFeattures.getmap();

        do {
            System.out.println();
            System.out.print("是否开始摇骰子(y/n),按n结束游戏:");
            char c = Utility.readConfirmSelection();
            if (c=='N'){
                lop=false;
            }
            if (c=='Y'){
                    int r=random.nextInt(6)+1;
                    System.out.println("您摇晃的骰子为"+r+"您可以走"+r+"步");
                    count2+=r;
                    if (r==6){
                        System.out.println("恭喜您获得免费一次摇骰子机会");
                        int r1=random.nextInt(6)+1;
                        count2+=r1;
                        System.out.println("中将骰子为"+r1+"加上之前的步数"+"您可以走"+(r1+6)+"步");
                    }
                System.out.println("-----棋盘-----");
            }
            if (count2>67){
                count2=67-(count2-67);
            }if (c=='N'){
                lop=false;
            }else {
                LudoFeattures.change(count2,s);
                count++;
                LudoFeattures.getmap();
                System.out.println();
                System.out.print("当前骰子位置为:"+count2);
                LudoFeattures.change0(count2);
            }
            if (count2==67){
                System.out.println();
                System.out.println("恭喜通关");
                System.out.println("摇骰子次数为"+count+"次");
                lop=false;
            }
        }while (lop);
        Date date1 = new Date();
        date1.getTime();
        System.out.println("开始时间:"+sdf.format(date));
        System.out.println("结束时间:"+sdf.format(date1));
        System.out.print("总用时为:"+ LudoApp.utils.Utility.calculateTimeDifference(date,date1));
        System.out.println();
        System.out.println("游戏结束");
    }
}
