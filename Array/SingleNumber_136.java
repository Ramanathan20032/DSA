package Array;

// https://leetcode.com/problems/single-number
// Each element in the array appears twice except for one element which appears only once.
// using Bit Manipulation.

//XOR of two equal numbers results in 0 (e.g., 2 ^ 2 = 0).
//XOR of a number with 0 is the number itself (e.g., 1 ^ 0 = 1).
//XOR is also commutative, so the order of operations doesn't matter.

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(findSingleNumber(arr));
    }
    static int findSingleNumber(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
