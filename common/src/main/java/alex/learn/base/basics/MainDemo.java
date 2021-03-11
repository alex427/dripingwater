package alex.learn.base.basics;

import alex.learn.web.domains.User;
import com.google.gson.Gson;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

/**
 * author  : zhiguang
 * date    : 2018/7/9
 */
public class MainDemo {
    public static void main(String[] args) throws IOException, ParseException {
        User u1 = new User(0,"mack",1,"boss","hangzhou",100000,50000);
        User u2 = new User(0,"zack",1,"programmer","hangzhou",10000,5000);
        User u3 = new User(0,"yack",1,"archtectur","wuhan",50000,50000);

        User[] arr = new User[3];
        arr[0]=u1;
        arr[1]=u2;
        arr[2]=u3;

        Gson g = new Gson();
        //System.out.println(g.toJson(arr));


        CheDan chedan = new CheDan();
        chedan.setColumntype("DATE");
        //chedan.setMax("2018-07-01"); //1530374400000
        //chedan.setMax("20180701");  //1530374400000
        //chedan.setMax("2018-07-01 12:01:01");  // 1514736061000
        chedan.setMax("20180701 12:01:01");   // 1514736061000
        String str = chedan.getDformat();

        System.out.println(chedan);
        System.out.println(str);

        ttest(3);

       // Map<Integer,Integer> table = new Hashtable<>();  11, 0.75F, key value都不能是null

        Set<String> set = new HashSet<>();
        set.add("aa");

    }

    public static void ttest(int a) throws IOException {
        if(a==1){
            System.out.println(555);
        }else {
            System.out.println(99);
            throw new IOException("我要抛异常");
        }
        System.out.println(77);
    }


}
