package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class findCommonElements_2956 {
    public static void main(String[] args) {
        int[] num1 = {4, 3, 2, 3, 1};
        int[] num2 = {2, 2, 5, 2, 3, 6};
        int[] result = findIntersectionValues(num1, num2);
        System.out.println(Arrays.toString(result));
    }
    static int[] findIntersectionValues(int[] num1, int[] num2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : num1){
            set1.add(i);
        }
        for(int i : num2){
            set2.add(i);
        }

        int firstIndexCount = 0;
        for(int i : num1){
            if(set2.contains(i) == true){
               firstIndexCount++;
            }
        }
        int secondIndexCount = 0;
        for(int i : num2){
            if(set1.contains(i) == true){
                secondIndexCount++;
            }
        }
        return new int[]{firstIndexCount, secondIndexCount};
    }
}
