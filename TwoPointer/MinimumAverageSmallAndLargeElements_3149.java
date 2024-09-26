package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumAverageSmallAndLargeElements_3149 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 4, 15, 13, 4, 1};
        System.out.println(minimumAverage(arr));
    }
    static double minimumAverage(int[] arr){
        ArrayList<Double> averageList = new ArrayList<>();
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int minElement = arr[start];
            int maxElement = arr[end];
            double average = (minElement + maxElement) / 2;
            averageList.add(average);
            start++;
            end--;
        }
        double minAverage = averageList.get(0);
        for(double avg : averageList){
            minAverage = Math.min(minAverage, avg);
        }
        return minAverage;
    }
}
