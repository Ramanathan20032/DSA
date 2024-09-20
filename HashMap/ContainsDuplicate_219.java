package HashMap;

import java.util.HashMap;

// Given an integer array nums and an integer k, return true.
// if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

public class ContainsDuplicate_219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3},2));
        System.out.println(containsNearbyDuplicate(new int[]{ 1, 0, 1, 1},1));
    }

//    it checks if the current number is already present in the map.
//    If the number is found in the map, it calculates the difference between the current index (i) and the index stored in the map (j).
//    If the difference is less than or equal to k, the function returns true indicating that there are two nearby duplicates.
//    If no such pair is found after iterating through the entire array, the function returns false.
    static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int j = map.get(arr[i]);
                if(Math.abs(i - j) <= k){
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
