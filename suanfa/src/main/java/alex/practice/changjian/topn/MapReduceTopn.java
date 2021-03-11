package alex.practice.changjian.topn;

import java.util.*;

/**
 * author  : zhiguang
 * date    : 2018/8/3
 */
public class MapReduceTopn {

    private static String[] arr = new String[20];
    private static List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();

    public static void main(String[] args) {
        init(arr);
        //获取tuple
        list = getTuple(arr);
        //统计频率
        //topn


    }


    public static void init(String[] arr) {
        arr[0] = "apple";
        arr[11] = "apple";
        arr[2] = "apple";
        arr[3] = "apple";
        arr[4] = "pear";
        arr[5] = "pear";
        arr[16] = "pear";
        arr[7] = "pear";
        arr[8] = "pear";
        arr[9] = "banana";
        arr[10] = "banana";
        arr[1] = "banana";
        arr[12] = "banana";
        arr[13] = "banana";
        arr[14] = "banana";
        arr[15] = "banana";
        arr[6] = "banana";
        arr[17] = "banana";
        arr[18] = "tomato";
        arr[19] = "tomato";
    }

    public static List<Map<String, Integer>> getTuple(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(arr[i], 1);
            list.add(map);
        }
        return list;
    }

    public static Map<String, Integer> getFrequency(List<Map<String, Integer>> list){
        String tmpkey;
        for(Map<String, Integer> map : list){

        }
        return null;
    }


}
