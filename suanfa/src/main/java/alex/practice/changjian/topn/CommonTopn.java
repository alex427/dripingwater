package alex.practice.changjian.topn;

import java.util.*;

/**
 * author  : zhiguang
 * date    : 2018/8/6
 */
public class CommonTopn {

    private static String[] arr = new String[20];

    public static void main(String[] args){
        init(arr);
        List<Map.Entry<String, Integer>> list = getTopn(arr, 3);
        for (Map.Entry<String, Integer> e : list){
            System.out.println(e.getKey() +" : "+ e.getValue());
        }

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

    public static  List<Map.Entry<String, Integer>> getTopn(String[] arr, int n) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<arr.length;i++){
            int count=1;
            if( !map.containsKey(arr[i]) ){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j].equals(arr[i])){
                        count++;
                    }
                }
                map.put(arr[i],count);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        return list.subList(0,n);
    }

}

