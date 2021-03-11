package alex.learn.utils;

import org.apache.commons.lang.math.RandomUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhiguang on 2018/7/15.
 */
public class GuaxiangGenerator {

    private static int[] arr = new int[6];
    private static String[] gua = new String[64];

    public static void main(String[] args){
        init();
        StringBuffer buf = new StringBuffer();
        for(int i=0;i<6;i++){
            arr[i] = cretreYao();
            buf.append(arr[i]);
        }
        System.out.println(buf);
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                System.out.println("- -");
            }else if (arr[i]==1){
                System.out.println("——");
            }
        }
        
        for(int i=0;i<64;i++){
            String[] ga = gua[i].split("a");
            if(buf.toString().equalsIgnoreCase(ga[0])){
                System.out.println(i+1);
                System.out.println(ga[1]);
                break;
            }
        }
        
    }

    public static int cretreYao(){
        int rand = RandomUtils.nextInt(100);
        int yao = rand%2;
        return yao;
    }

    public static void init(){
        gua[0]="111111a乾";
        gua[1]="000000a坤";
        gua[2]="010001a屯";
        gua[3]="100010a蒙";
        gua[4]="010111a需";
        gua[5]="111010a讼";
        gua[6]="000010a师";
        gua[7]="010000a比";
        gua[8]="110111a小畜";
        gua[9]="111011a履";
        gua[10]="000111a泰";
        gua[11]="111000a否";
        gua[12]="111101a同人";
        gua[13]="101111a大有";
        gua[14]="000100a谦";
        gua[15]="001000a豫";
        gua[16]="011001a随";
        gua[17]="100110a蛊";
        gua[18]="000011a临";
        gua[19]="110000a观";
        gua[20]="101001a噬嗑";
        gua[21]="100101a贲";
        gua[22]="100000a剥";
        gua[23]="000001a复";
        gua[24]="111001a无妄";
        gua[25]="100111a大畜";
        gua[26]="100001a颐";
        gua[27]="011110a大过";
        gua[28]="010010a坎";
        gua[29]="101101a离";
        gua[30]="011100a咸";
        gua[31]="001110a恒";
        gua[32]="111100a遁";
        gua[33]="001111a大壮";
        gua[34]="101000a晋";
        gua[35]="000101a明夷";
        gua[36]="110101a家人";
        gua[37]="101011a睽";
        gua[38]="010100a蹇";
        gua[39]="001010a解";
        gua[40]="100011a损";
        gua[41]="110001a益";
        gua[42]="011111a夬";
        gua[43]="111110a姤";
        gua[44]="011000a萃";
        gua[45]="000110a升";
        gua[46]="011010a困";
        gua[47]="010110a井";
        gua[48]="011101a革";
        gua[49]="101110a鼎";
        gua[50]="001001a震";
        gua[51]="100100a艮";
        gua[52]="110100a渐";
        gua[53]="001011a归妹";
        gua[54]="001101a丰";
        gua[55]="101100a旅";
        gua[56]="110110a巽";
        gua[57]="011011a兑";
        gua[58]="110010a涣";
        gua[59]="010011a节";
        gua[60]="110011a中孚";
        gua[61]="001100a小过";
        gua[62]="010101a既济";
        gua[63]="101010a未济";
    }
}
