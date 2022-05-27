package SmallChange_01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        boolean lop=true;
        Scanner scanner = new Scanner(System.in);
        String details="==============零钱通明细==============";
        int key=0;
        double money=0;
        double balance=0;
        Date date=null;
        do{
            System.out.println("\n==============零钱通菜单==============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.充值余额");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.查询余额");
            System.out.println("\t\t\t5.退     出");
            System.out.print("请选择(1-5): ");
            key =scanner.nextInt();
            switch (key){
                case 1: System.out.println(details);break;
                case 2:
                    System.out.println("--------注意事项:充值金额单笔充值最高一万元RMB--------");
                    System.out.print("输入充值金额：");
                    money=scanner.nextDouble();
                    if (money<=0||money>10000){
                        System.out.println("充值失败");
                        System.out.println("充值金额必须在1-10000元之间");break;
                    }
                        balance+=money;
                        date=new Date();
                        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        details+="\n收益入账\t"+String.format("+%.2f", money)+"\t"+"日期"+"\t"+sd.format(date)+"\t"+"余额"+"\t"+String.format("%.2f", balance)+"RMB";
                        System.out.println("充值成功");
                break;
                case 3:
                    String not;
                    System.out.print("输入消费金额：");
                    double Consymption=scanner.nextDouble();
                    System.out.print("消费说明");
                    not=scanner.next();
                    if (balance<Consymption){
                        System.out.println("-----支付失败——余额不足-----");break;
                    } if (0>=Consymption){
                    System.out.println("支付必须大于0");break;
                }
                        balance-=Consymption;
                        date=new Date();
                        SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        details+="\n"+not+"\t"+String.format("-%.2f", Consymption)+"\t"+"日期"+"\t"+st.format(date)+"\t"+"余额"+"\t"+String.format("%.2f", balance)+"RMB";
                        System.out.println("消费成功");
                ;break;
                case 4: System.out.println("余额查询");
                    System.out.println("余额为:"+String.format("%.2f", balance)+"RMB");
                break;
                case 5: String yn="";
                    while (true){
                        System.out.println("是否确认退出（y or no）");
                        yn=scanner.next();
                        if (yn.equals("y")||yn.equals("no")){
                            break;                        }else {
                            System.out.println("请输入正确的（y or no）");
                        }
                    }if (yn.equals("y")){
                    lop=false;break;
                }else {
                    System.out.println("------程序已继续运行中------");break;
                }
                default:
                    System.out.println("输入有误，请输入1-4");
            }

        }while (lop);
        System.out.println("------已退出零钱通程序------");
    }
}
