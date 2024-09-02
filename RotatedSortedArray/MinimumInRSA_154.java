package RotatedSortedArray;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii

public class MinimumInRSA_154 {
    public static void main(String[] args) {
//        int[] arr = {6, 7, 1, 2, 4, 5};
        int[] arr = {1, 2, 3, 4, 6, 9};
        System.out.println(findMin(arr));
//        int[] arr1 = {5, 5, 5, 5, 5, 6, 7, 8, 8, 8, 8, 2, 3, 3, 5};
        int[] arr1 =  {0, 1, 4, 4, 5, 6, 7};
        System.out.println(findMinWithDuplicates(arr1));
    }
    static int findMin(int[] arr){
        int pivot = findPivot(arr);
        if(pivot == -1){
            // if pivot = -1, arr is not rotated. return first element
            return arr[0];
        }
        // return smallest(pivot + 1)
        return arr[pivot + 1];
    }
    static int findMinWithDuplicates(int[] arr1){
        int pivot = findPivotWithDuplicates(arr1);
        if(pivot == -1){
            // if pivot = -1, arr is not rotated. return first element
            return arr1[0];
        }
        // return smallest(pivot + 1)
        return arr1[pivot + 1];
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                if(start < end && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(end > start && arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
