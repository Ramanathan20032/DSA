package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        // Array must be Sorted
        // In Ascending Order (or) Descending order
        System.out.println(binarySearch(new int[] {1, 3, 8, 9, 14, 25, 37, 39, 44, 46, 50, 64}, 8));
        System.out.println(binarySearch(new int[] {90, 75, 18, 12, 6, 4, 3, 1},75));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = true;                       // To check weather the array is ascending or descending.
        if(arr[start] > arr[end]){
            isAsc = false;
        }

        while (start <= end){                       // condition terminates when start > end;
            int mid = start + (end - start) / 2;    // mid element
            if(arr[mid] == target){                 // common for both ascending and descending order.
                return mid;
            }
            if(isAsc){                              // if ascending order then
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {                                   // if descending order then
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
