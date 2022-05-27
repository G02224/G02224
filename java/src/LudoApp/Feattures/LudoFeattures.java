package LudoApp.Feattures;


public class LudoFeattures {

    public static String []arr=new String[67];
    public static void arr(){
        for (int i = 0; i <arr.length; i++) {
            arr[i]="✪";
        }
    }
    public static void change(int index,String name){
        arr[index-1]=name;
    }
    public static void change0(int index){
        arr[index-1]="✪";
    }
    public static void getmap(){

        for (int i = 0; i <arr.length ; i++){
            if (i<=20){
                System.out.print(arr[i]+"\t");
            }
            if (i==21){
                System.out.println();
                for (int j = 0; j <20 ; j++) {
                    System.out.print(" "+"\t");
                } System.out.print(arr[i]+"\t");
            }if (i==22){
                System.out.println();
                for (int j = 0; j <20 ; j++) {
                    System.out.print(" "+"\t");
                } System.out.print(arr[i]+"\t");
            }if (i==23){
                System.out.println();
                for (int j =43 ; j >22 ; j--) {
                    System.out.print(arr[j]+"\t");
                }
            }if (i==44){
                System.out.println();
                System.out.print(arr[i]+"\t");
                for (int j = 0; j <20 ; j++) {
                    System.out.print(" "+"\t");
                }
            }
            if (i==45){
                System.out.println();
                System.out.print(arr[i]+"\t");
                for (int j = 0; j <20 ; j++) {
                    System.out.print(" "+"\t");
                }
            }
            if (i==46){
                System.out.println();
                for (int j = 46; j <=66 ; j++) {
                    System.out.print(arr[j]+"\t");
                }
            }if (i==66){
                LudoFeattures.arr[i]="♛";
            }
        }
    }
}
