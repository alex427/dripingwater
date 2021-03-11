package alex.practice.xiaojiayu.linear;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiguang on 2018/8/19.
 */
public class JosephRing {

    public static void main(String[] args){
        List<Integer> list = init(8);
        System.out.println(getLast(list));
    }


    public static List<Integer> init(int c){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=c;i++){
          list.add(i);
        }
        return list;
    }


    public static int getLast(List<Integer> list){
        int baoshu = 1;

        for(int i=0; list.size()!=1; i++){
            if(i==list.size()){
                i=0;
            }

            if(baoshu%3 == 0){
                list.remove(i);
                i=i-1;
            }

            baoshu++;
        }
        return list.get(0);
    }
}
