package BinarySearch;

public class DescBinarySearch {
    public static void main(String[] args) {
        // Array must be Sorted
        // for Descending order
        System.out.println(binarySearch(new int[] {90, 75, 18, 12, 6, 4, 3, 1}, 4));
        System.out.println(binarySearch(new int[] {90, 75, 18, 12, 6, 4, 3, 1}, 7));
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                end = mid - 1;
            }
            else if (target < arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
