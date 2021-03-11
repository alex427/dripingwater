package alex.practice.changjian.digui;

/**
 * author  : zhiguang
 * date    : 2018/8/13
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 6, 4, 2, 7,11,12,15,16,22,23,24,25};
        mergesort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (high <= 2 && low<high) {
            for (int i = 0; i < high; i++) {
                System.out.println(arr[i] + "  ");
            }
        } else {
            int mid = (low + high) / 2;
            mergesort(arr, 0, mid);
            mergesort(arr, mid+1, high);
        }
    }


}
