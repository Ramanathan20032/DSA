package BinarySearch;
//  Floor of a number in Array
//  find the greatest number which is less than or equal to target....
public class FloorOfNumber {
    public static void main(String[] args) {
        System.out.println(floor(new int[] {2, 3, 5, 9, 14, 16, 18}, 10));  // 9(3)
    }

    //return the index : greatest number <= target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){          // search in Left
                end = mid - 1;
            }
            else if(target > arr[mid]){     // search in Right
                start = mid + 1;
            }
            else {
                return mid;     // mid element == target
            }
        }
        // next Smaller element to mid
        return end;     // arr[end]
    }
}
