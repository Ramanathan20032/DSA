package BinarySearch;
//  ceiling of a number in Array
//  find the smallest number which is greater than or equal to target....
public class CeilOfNumber {
    public static void main(String[] args) {
        System.out.println(ceil(new int[] {2, 3, 5, 9, 14, 16, 18}, 15));   // 16(5)
    }

    // return index : Smaller number >= target
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){             // search in Left
                end = mid - 1;
            }
            else if (target > arr[mid]) {      // search in Right
                start = mid + 1;
            }
            else {
                return mid; // mid element == target
            }
        }
        // next greater element to mid
        return start;   // return arr[start]
    }
}
