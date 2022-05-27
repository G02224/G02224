package MoraApp.Interface;

import MoraApp.Feattures.MoraFeattures;
import MoraApp.utils.Utility;

import java.util.Random;

public class MoraInterface {
    public void printInter(){
        Random random = new Random();
        System.out.println("===============欢迎来到猜拳程序===============");
        System.out.println("程序开始");
        System.out.print("创建您的昵称:");
        String s = Utility.readString(8);
        MoraFeattures.getname(s);
        System.out.print(s+"请输入需要猜拳局数:");
        int i1 = Utility.readInt();
        for (int i = 0; i <i1 ; i++) {
                System.out.println("规则：输入数字0-2(0-拳头 1-剪刀 2-布)");
                System.out.print(s+"请输入(0-2)出拳：");
                int i2 = Utility.readInt();
                if (i2>2){
                    boolean lop=true;
                    do {
                        System.out.println("输入范围在0-2请重新输入");
                        int i3 = Utility.readInt();
                        if (i3<3){
                            i2=i3;
                            lop=false;
                        }
                    }while (lop);
                }
                System.out.print(s+"出拳：");
                MoraFeattures.namemore(i2);
                System.out.println();
                int n=random.nextInt(3);
                MoraFeattures.comptmora(n);
                System.out.println();
                MoraFeattures.judgemora(n,i2);
            }
            System.out.println(i1+"局游戏结果:");
            System.out.println("获胜次数:"+MoraFeattures.judg[0]);
            System.out.println("平局次数:"+MoraFeattures.judg[1]);
            System.out.println("失败次数:"+MoraFeattures.judg[2]);
            System.out.println("游戏结束");
        }
        }

