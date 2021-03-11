package alex.practice.changjian.digui;

/**
 * author  : zhiguang
 * date    : 2018/8/13
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,1,5,6,4,2,7};
        //int[] arr = {3,1,5};
        int[] tmp = new int[arr.length];
        mergesort(arr,0,arr.length-1,tmp);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void mergesort(int[] arr,int low,int high,int[] tmp){
        if(low<high) {
            int mid = (low + high) / 2;
            mergesort(arr, 0, mid, tmp);
            mergesort(arr, mid + 1, high, tmp);
            domerge(arr, low, mid, high, tmp);
        }
    }

    //归并过程分4步
    private static void domerge(int[] arr, int low, int mid, int high, int[] tmp) {
        int i = low;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针

        while (i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                tmp[t] = arr[i];
                i++;
                t++;
            }else {
                tmp[t] = arr[j];
                j++;
                t++;
            }
        }

        //将左边剩余元素填充进temp中
        while(i<=mid){
            tmp[t] = arr[i];
            i++;
            t++;
        }

        //将右序列剩余元素填充进temp中
        while(j<=high){
            tmp[t] = arr[j];
            j++;
            t++;
        }

        //将temp中的元素全部拷贝到原数组中
        t = 0;
        while(low <= high){
            arr[low] = tmp[t];
            low++;
            t++;
        }

    }


}
