package alex.practice.changjian;

/**
 * author  : zhiguang
 * date    : 2018/8/13
 * 自己开发一个二进制到十进制的转换器
 */
public class BinaryTransmittor {

    public static void main(String[] args) {
        System.out.println(convert(1111111));
    }

    public static int convert(int binarynum) {
        int t = 0;
        int p;
        String s = binarynum + "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (binarynum <= 0) {
                return 0;
            } else {
                int mod = binarynum % 10;
                t += mod * (Math.pow(2, i));
            }
        }
        return t;
    }

}
