package alex.practice.changjian.digui;

/**
 * author  : zhiguang
 * date    : 2018/8/13
 * 分治法
 */
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = new int[]{2,3,5,6,7,9,11,12,13,17,18,22,23,27,34,55};
        int index = getTarget(arr,0,15,23);
        System.out.println(index);
    }

    public static int getTarget(int[] arr,int low, int high,int target){
        System.out.println(low+"  "+high+"  "+(low+high)/2);
        int mid = (low+high)/2;
        if(arr[mid]==target){
            return mid;
        } else {
            if(arr[mid] < target){
                return getTarget(arr,mid+1,high,target);
            } else {
                return getTarget(arr,low,mid-1,target);
            }
        }
    }
}
