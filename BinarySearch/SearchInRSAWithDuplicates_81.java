package BinarySearch;

public class SearchInRSAWithDuplicates_81 {
    public static void main(String[] args) {
        int[] arr = {6, 6, 6, 7, 7, 2, 4, 5};
        int target = 7;
        System.out.println(searchInRSA(arr, target));
    }
    static int searchInRSA(int[] arr, int target){
        int pivot = findPivot(arr);
        // If there is no pivot, then the array is not rotated
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        // If the target is at the pivot
        if(arr[pivot] == target){
            return pivot;
        }
        // Determine which part of the array to search
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
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
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}