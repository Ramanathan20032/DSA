package BinarySearch;

// https://leetcode.com/problems/split-array-largest-sum

public class SplitArray_410 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }
    static int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);  // return the max element from the Array.
            end += arr[i];                    // sum of all the elements.
        }

        // binary search
        while (start < end){
            // potential answer (sum of the subArray)
            int mid = start + (end - start) / 2;

            // how many piece you can divide this with in the max
            int sum = 0;    // to calculate the subArray
            int piece = 1;  // no.of.parts (subArray)

            for (int num : arr){
                if(sum + num > mid){
                    // cannot add this in the subArray, it exceeds the max
                    // so, add this into new subArray, then sum = num.
                    sum = num;
                    piece++;
                }
                else {
                    // if not exceeds the mid(max), keep adding
                    sum += num;
                }
            }
            if(piece > m){
                start = mid + 1;
            }
            else {
                // piece <= m
                // individual sum is very large, so reduce.
                end = mid;
            }
        }
        return start;  // start == end
    }
}
