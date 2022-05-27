package Houset.service;

import Houset.domain.Houses;
import Houset.view.Housegn;
import Houset.utils.Utility;

public class Housejm {
    private boolean lop=true;
    Housegn housegn=new Housegn(2);
    public void changehoues(){
        System.out.println("\n---------------------修改房屋信息---------------------");
        System.out.print("请输入需要修改房屋的id编号:");
        int key=Utility.readInt();
        if (housegn.change(key)){
            System.out.println("修改完成-------");
        }
    }
    public void outapp(){
        System.out.println("\n---------------------退出房屋出租系统---------------------");
        System.out.print("是否退出房屋出租系统(y/n)：");
        char c = Utility.readConfirmSelection();
        if (housegn.out(c)){
            lop=false;
        }
    }
    public void findhoues(){
        System.out.println("\n---------------------查找房屋信息---------------------");
        System.out.print("请输入需要查找房屋的id编号:");
        int key=Utility.readInt();
        if (!housegn.find(key)){
            System.out.println("未查询到该房屋的id编号");
        }
    }
    public void deltHouses(){
        System.out.println("\n---------------------删除房屋信息---------------------");
        System.out.print("请输入需要删除房屋的id编号:");
        int key=Utility.readInt();
        if (housegn.delt(key)){
            System.out.println("删除成功--------");
        }else {
            System.out.println("删除失败--------");
        }
    }
    public void Houselist(){
        System.out.println("\n---------------------房屋信息列表---------------------");
        System.out.println("编号\t房主\t电话\t\t地址\t月租\t状态\t");
        housegn.printHouse();
    }
    public void newHouse(){
        System.out.println("\n---------------------新增房屋信息---------------------");
        System.out.print("请输入姓名：");
        String neme= Utility.readString(6);
        System.out.print("请输入电话：");
        String phone= Utility.readString(16);
        System.out.print("请输入地址：");
        String addr= Utility.readString(20);
        System.out.print("请输入月租：");
        String sala= Utility.readString(5);
        System.out.print("请输入房屋状态(已出租/未出租)：");
        String texr= Utility.readString(3);
        Houses houses=new Houses(0,neme,phone,addr,sala,texr);
        housegn.gethouse(houses);
    }
    public void Housesmenu(){
        do {
            System.out.println("---------------------房屋出租系统---------------------");
            System.out.println("\t\t\t\t1.新 增 房 源");
            System.out.println("\t\t\t\t2.查 找 房 屋");
            System.out.println("\t\t\t\t3.删 除 房 屋");
            System.out.println("\t\t\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5.房 屋 列 表");
            System.out.println("\t\t\t\t6.退       出");
            System.out.print("请输入您的选择(1-6)：");
                char key= Utility.readChar();
                    switch (key){
                        case '1':
                            newHouse();
                            break;
                        case '2':
                            findhoues();
                            break;
                        case '3':
                            deltHouses();
                            break;
                        case '4':
                            changehoues();
                            break;
                        case '5':
                           Houselist();
                            break;
                        case '6':
                            outapp();
                            break;
                    }
        }while (lop);
        System.out.println("您以退出房屋出租系统------");
    }
}
