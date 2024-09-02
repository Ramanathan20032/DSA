package HashMap;
// https://leetcode.com/problems/split-the-array

/*
 * You are given an integer array nums of even length. You have to split the array into two parts [num1] & [num2]
 * num1 & num2 should contain only unique elements
 */

import java.util.HashMap;

public class SplitTheArray_3046 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println(isPossibleToSplit(arr));
    }
    static boolean isPossibleToSplit(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) == 3){
                return false;
            }
        }
        return true;
    }
}
