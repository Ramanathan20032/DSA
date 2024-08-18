package BinarySearch;
// leetcode.com/problems/search-insert-position

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 8;
        System.out.println(ceil(arr, target));
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) { // search in Left
                end = mid - 1;
            } 
            else if (target > arr[mid]) { // search in Right
                start = mid + 1;
            } 
            else {
                return mid; // mid element == target
            }
        }
        // next greater element to mid
        return start; // return arr[start]
    }
}
