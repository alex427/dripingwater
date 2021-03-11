package alex.practice.changjian.shenghuo;

/**
 * author  : zhiguang
 * date    : 2018/8/6
 */
public class Shizhong {

    //分针每分钟转6度
    //时针一小时转30度(360/12), 每分钟转0.5度(30/60)
    // X时Y分
    //30X+0.5Y=6Y ==>  y=30/5.5=300/55

    public static void main(String[] args){
        for(int x=0;x<12;x++){
            System.out.println( x +"点"+getPositiion(x)+"分");
        }
    }

    public static float getPositiion(float x){
        return (300*x)/55;
    }
}
