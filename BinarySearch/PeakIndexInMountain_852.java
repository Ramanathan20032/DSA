package BinarySearch;
// leetcode.com/problems/peak-index-in-a-mountain-array

public class PeakIndexInMountain_852 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};   // Bitonic Array
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part
                // Then it could be the end
                end = mid;
            }
            else {
                // you are in increasing part
                // arr[mid] < arr[mid+1]
                // then mid+1 will be the new Start
                start = mid + 1;
            }
        }
        // then at one point, start == end and pointing towards the largest element(max)
        return start;
//        return end;       // or end , because both are equal.
    }
}
