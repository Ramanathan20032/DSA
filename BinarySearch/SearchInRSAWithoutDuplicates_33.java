package BinarySearch;
// leetcode.com/problems/search-in-rotated-sorted-array

public class SearchInRSAWithoutDuplicates_33 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 0, 1, 2, 4 ,5};
        int target = 2;
        System.out.println(searchInRSA(arr, target));
    }
    static int searchInRSA(int[] arr, int target){
        int pivot = findPivot(arr);
        // if pivot is not found, it means the array is not rotated.
        if(pivot == -1){
            // just do normal binary search.
            return binarySearch(arr, target, 0, arr.length-1);
        }

        // if pivot is found, 2 ascending sorted arrays will be obtained.
        // case 1 : if the pivot element == target
        if(arr[pivot] == target){
            return pivot;
        }

        // case 2 : if target > start [after pivot all numbers are < start]
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        // case 3 : if target < start [elements from start -> pivot are going to > than target]
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[start] >= arr[mid]){
                end = mid - 1;
            }
            if (arr[start] <= arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}