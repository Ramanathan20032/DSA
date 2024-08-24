package RotatedSortedArray;

public class PivotInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases over here

            // case 1 :
            // what if mid is last index, mid + 1 will out of bound
            // so, mid < end
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case 2 :
            // what if mid is first index, mid - 1 will out of bound
            // so, mid > start
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // case 3 :
            // when start > mid, followed from [mid -> arr.length] will be smaller than start.
            // (i.e) they are sorted.
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            // case 4 :
            // if the mid was "pivot", it would have been caught in case1 & case2
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}

