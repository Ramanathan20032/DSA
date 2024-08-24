package RotatedSortedArray;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int[] arr1 = {5, 5, 5, 5, 5, 6, 7, 8, 8, 8, 8, 1, 1, 1 , 2, 3, 3};
        System.out.println(countRotation(arr));
        System.out.println(countRotationWithDuplicates(arr1));
    }
    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        // if array is not rotated it returns -1 (-1+1 = 0)
        return pivot + 1; // no. of. times rotated
    }
    static  int countRotationWithDuplicates(int[] arr){
        int pivot = findPivotWithDuplicates(arr);
        // if array is not rotated it returns -1 (-1+1 = 0)
        return pivot + 1; // no. of. times rotated
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
