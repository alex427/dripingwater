package alex.practice.changjian.topn;
import java.util.ArrayList;
import java.util.List;


//没搞懂。。。。
public class TopKByMerge {

    public static int[] getTopK(List<List<Integer>>input,int k){
        //保存每个数组下标扫描的位置;

        int index[]=new int[input.size()];
        //结果数组
        int result[]=new int[k];

        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int maxIndex=0;
            for(int j=0;j<input.size();j++){
                if(index[j]<input.get(j).size()){
                    if(max<input.get(j).get(index[j])){
                        max=input.get(j).get(index[j]);
                        maxIndex=j;
                    }
                }
            }
            if(max==Integer.MIN_VALUE){
                return result;
            }
            result[i]=max;
            index[maxIndex]+=1;
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        List<Integer> b = new ArrayList<Integer>();
        b.add(6);
        b.add(5);
        b.add(3);
        b.add(1);
        List<List<Integer>> ab = new ArrayList<List<Integer>>();
        ab.add(a);
        ab.add(b);
        int r[] = getTopK(ab, 3);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }


}
