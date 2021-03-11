package alex.learn.base.basics;

import java.util.BitSet;

/**
 * author  : zhiguang
 * date    : 2018/8/13
 */
public class Erjinzhi {
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toBinaryString(2147483647)); //  111,1111,1111,1111,1111,1111,1111,1111
        System.out.println(Integer.toBinaryString(2147483640)); //  111,1111,1111,1111,1111,1111,1111,1000
        System.out.println(Integer.toBinaryString(1000000000)); //   11,1011,1001,1010,1100,1010,0000,0000
        System.out.println(Integer.toBinaryString(100000000)); //        101,1111,0101,1110,0001,0000,0000

        System.out.println(Integer.toBinaryString(2147483647+1));// 10000000000000000000000000000000

        System.out.println(Integer.parseInt("1000000000000000000000000000000",2)); //1073741824


        System.out.println(Integer.parseInt("1111",2));
        System.out.println(Integer.parseInt("1000",2));


    }
}
