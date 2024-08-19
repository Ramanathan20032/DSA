package BinarySearch;
// leetcode.com/problems/find-in-mountain-array

public class SearchInMountain_1095 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 6, 4, 2, 0};
        int target = 2;
        System.out.println(searchInRange(arr, target));
    }
    static int searchInRange(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc = true;
        if(arr[start] > arr[end]){
            isAsc = false;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
