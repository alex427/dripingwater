package alex.practice.changjian.digui;

/**
 * author  : zhiguang
 * date    : 2018/8/13
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {3,1,5,6,4,2,7};
        quicksort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void quicksort(int[] arr, int low, int high) {

        //进入程序执行合法性判断
        if(low>high){
            return;
        }

        //选择基准
        int base = arr[low];
        //定义两个游标
        int left = low;
        int right = high;
        int tmp;
        //两个游标各自独立向中间探测， 右边的先开始, 左右相遇的时候结束探测
        //探测目标：右边探测比base小的数字， 左边探测比base大的数字
        while (left < right) {
            while (arr[right] >= base && left < right) {
                right--; //向中间移动
            }
            while (arr[left] <= base && left < right) {
                left++; //向中间移动
            }
            //两个跳出的时候，肯定发生下面三个条件中的两个：
            //left遇到比base大的， right遇到比base小的， 两个游标相遇
            //没有相遇而跳出之后的逻辑：左右交换各自的数字
            if(left < right){
                tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
        //左右相遇而跳出：基准和相遇位置的数字交换位置，然后执行分治处理
        tmp = arr[left];
        arr[left]=base;
        base=arr[low]=tmp;

        quicksort(arr,low,right-1);
        quicksort(arr,right+1,high);

    }

}
