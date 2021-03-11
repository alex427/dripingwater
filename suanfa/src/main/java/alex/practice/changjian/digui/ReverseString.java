package alex.practice.changjian.digui;


//字符串反序输出
public class ReverseString {

    public static void main(String[] args) {
        reverseStr("begin");
    }

    public static void reverseStr(String str) {
        if (str.length() == 1 || str.length() == 0) {
            System.out.println(str);
        } else {
            String s1 = str.substring(0, str.length() - 1); //剩余部分
            String s2 = str.substring(str.length() - 1); //当前输出
            System.out.print(s2);
            reverseStr(s1);
        }
    }
}

