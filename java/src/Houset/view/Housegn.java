package Houset.view;

import Houset.domain.Houses;
import Houset.utils.Utility;


public class Housegn {
    private Houses[] houses;
    private Houses[] houses2;
    private int numers = 2;
    private int getid = 2;

    public boolean change(int key) {
        boolean lop = true;

        if (findindex(key) == -1) {
            System.out.println("未查询到该房屋id编号");
            return false;
        }
        System.out.println("房屋信息id为" + key + "的信息如下");
        System.out.println("编号\t房主\t电话\t\t地址\t月租\t房屋状态\t");
        System.out.println(houses[findindex(key)]);
        do {
            System.out.println("请选择需要修改的信息");
            System.out.println("1-姓名 2-电话 3-地址 4-月租 5-房屋状态 (-1)表示退出");
            int i = Utility.readInt();
            if (i == -1) {
                System.out.println("已退出修改");
                return false;
            }
            switch (i) {
                case 1:
                    System.out.print("姓名" + "(" + houses[findindex(key)].getName() + ")" + "修改后" + "：");
                    houses[findindex(key)].setName(Utility.readString(6));
                    break;
                case 2:
                    System.out.print("电话" + "(" + houses[findindex(key)].getPhone() + ")" + "修改后" + "：");
                    houses[findindex(key)].setPhone(Utility.readString(18));
                    break;
                case 3:
                    System.out.print("姓名" + "(" + houses[findindex(key)].getAddr() + ")" + "修改后" + "：");
                    houses[findindex(key)].setAddr(Utility.readString(20));
                    break;
                case 4:
                    System.out.print("月租" + "(" + houses[findindex(key)].getName() + ")" + "修改后" + "：");
                    houses[findindex(key)].setSalar(Utility.readString(8));
                    break;
                case 5:
                    System.out.print("房屋状态" + "(" + houses[findindex(key)].getTexr() + ")" + "修改后" + "：");
                    houses[findindex(key)].setTexr(Utility.readString(3));
                    break;
                default:
                    System.out.println("请输入数字(1-5)");
            }
            System.out.print("是否继续修改信息(y/n)：");
            char c = Utility.readConfirmSelection();
            if (c == 'N') {
                lop = false;
            }
        } while (lop);
        return true;
    }

    public boolean out(char c) {
        if (c != 'Y') {
            System.out.println("未退出程序，程序继续运行中-----");
            return false;
        }
        System.out.println("退出房屋出租系统成功---------");
        return true;
    }

    public boolean find(int key) {

        if (findindex(key) == -1) {
            return false;
        }
        System.out.println("已查询到以下信息：");
        System.out.println("编号\t房主\t电话\t\t地址\t月租\t房屋状态\t");
        System.out.println(houses[findindex(key)]);
        return true;
    }

    public boolean delt(int key) {
        if (findindex(key) == -1) {
            System.out.println("未查询到该房屋id编号");
            return false;
        }
        System.out.print("确认是否删除id:" + key + "\n" + "姓名：" + houses[findindex(key)].getName() + "的房屋信息，(y/n)：");
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            for (int i = findindex(key); i < numers - 1; i++) {
                houses[i] = houses[i + 1];
                houses[i].setId(houses[i].getId() - 1);
            }
            getid--;
            houses[--numers] = null;
        } else {
            return false;
        }
        return true;
    }
    public Housegn(int size) {
        houses = new Houses[size];
        houses[0] = new Houses(1, "王志文", "17358899401", "海南市", "1200", "未出租");
        houses[1] = new Houses(2, "魏晨", "17358819401", "上海市", "3200", "未出租");
    }

    public void printHouse() {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                return;
            }
            System.out.println(houses[i]);
        }
    }

    public void gethouse(Houses newhouese) {
        if (houses.length == numers) {
            houses2 = new Houses[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                houses2[i] = houses[i];
            }
            houses2[numers++] = newhouese;
            newhouese.setId(++getid);
            houses = houses2;
        } else {
            houses[numers++] = newhouese;
            newhouese.setId(++getid);
        }
        System.out.println("录入房屋信息成功-----");
    }

    public int findindex(int key) {
        int idex = -1;
        for (int i = 0; i < numers; i++) {
            if (houses[i].getId() == key) {
                idex = i;
            }
        }return idex;
    }
}
