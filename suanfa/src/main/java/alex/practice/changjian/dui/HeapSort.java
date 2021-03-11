package alex.practice.changjian.dui;

import java.util.Arrays;

/**
 * author  : zhiguang
 * date    : 2018/8/14
 *
 */
public class HeapSort {
    //1. 创建大堆； 2. 调整大堆为小堆
    public static void main(String []args){
        int[] arr = {4,6,8,5,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        //1.构建大顶堆
        //i=(arr.length/2)-1  这个算法非常关键，它是堆的特性，第一个非叶子节点的索引一定等于(n/2)-1
        for(int i=arr.length/2-1; i>=0; i--){
            adjustHeap(arr,i,arr.length);//从第一个非叶子结点从下至上，从右至左调整结构
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1; j>0; j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }
    }

    //调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
    public static void adjustHeap(int[] arr,int r,int length){
        //先取出当前元素r
        int tmp = arr[r];

        //从i结点的左子结点开始，也就是2r+1处开始 --> left=2r+1, right=2r+2
        //         r
        //   left    right
        for(int left=r*2+1; left<length; left=left*2+1){
            //如果左子结点小于右子结点，k指向右子结点
            if(left+1<length && arr[left]<arr[left+1]){
                left++;
            }
            //如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
            if(arr[left] >tmp){
                arr[r] = arr[left];
                r = left;
            }else{
                break;
            }
        }
        arr[r] = tmp;//将temp值放到最终的位置
    }

    public static void swap(int[] arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}