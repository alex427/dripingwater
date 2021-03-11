package alex.practice.changjian.digui;

import java.util.Arrays;

public class HeapSort {

    public static void main(String []args){
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            //adjustHeap(arr,i,arr.length);
            adjustHeap2(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            //adjustHeap(arr,0,j);//重新对堆进行调整
            adjustHeap2(arr,0,j);//重新对堆进行调整
        }
    }


    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k] >temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        //将temp值放到最终的位置
        arr[i] = temp;
    }


    public static void adjustHeap2(int []arr,int i,int length){
        int temp = arr[i];
        if( (2 * i) + 2<length) {
            if (arr[2 * i + 1] > arr[2 * i + 2]) {
                if (arr[2 * i + 1] > arr[i]) {
                    arr[i] = arr[2 * i + 1];
                    arr[2 * i + 1] = temp;
                }
            } else {
                if (arr[2 * i + 2] > arr[i]) {
                    arr[i] = arr[2 * i + 2];
                    arr[2 * i + 2] = temp;
                }
            }
        }
        
    }




    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
