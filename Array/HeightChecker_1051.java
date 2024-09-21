package Array;

// Build the correct order of heights by sorting another array, then compare the two arrays. return the count

import java.util.Arrays;

public class HeightChecker_1051 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};   // 3
//        int[] arr = {1, 2, 3, 4, 5};    // 0
        System.out.println(checkHeight(arr));
    }
    static int checkHeight(int[] height){
        int[] sortedHeight = height.clone();
        Arrays.sort(sortedHeight);
        int count = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i] != sortedHeight[i]){
                count++;
            }
        }
        return count;
    }
}
