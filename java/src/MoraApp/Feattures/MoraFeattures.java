package MoraApp.Feattures;

import MoraApp.InitialMora.Initia;

public class MoraFeattures {
    public static int []judg =new int[3];
    public static void judgemora(int compt,int name){
        if (name==0&&compt==1){
            System.out.println("您获胜");judg[0]++;
        }else if (name==1&&compt==2){
            System.out.println("您获胜");judg[0]++;
        }else if (name==2&&compt==0){
            System.out.println("您获胜");judg[0]++;
        }else if (name==compt){
            System.out.println("平局");judg[1]++;
        }else {
            System.out.println("您输了");judg[2]++;
        }
    }
    public static void comptmora(int key){
        System.out.print("电脑出拳："+Initia.getmora[key]);
    }
    public static void getname(String name){
        new Initia().setName(name);
        System.out.println("玩家昵称:"+name);
    }
    public static void namemore(int key){
        System.out.print(Initia.getmora[key]);
    }
}
