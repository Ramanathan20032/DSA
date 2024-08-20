package BinarySearch;

public class PivotInRotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 9, 2};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length- 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
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
            // Handling duplicates
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                // Skip the duplicates.
                // but, check the start & end are pivot.
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // case 4 :
            // pivot should be in right.
            else if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            // case 5 :
            // pivot should be in left.
            else {
                end = mid - 1;
            }
        }
        // No pivot found means array is not rotated
        return -1;
    }
}