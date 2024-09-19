package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateTheDigitsInArray_2553 {
    public static void main(String[] args) {
        int[] arr = {13, 25, 83, 77};
        int[] result = separateDigits(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] separateDigits(int[] arr){
        ArrayList<Integer> digitList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            // Handle the case where digit is 0
            int digit = arr[i];

            // Extract digits in reverse order
            ArrayList<Integer> temp = new ArrayList<>();
            while(digit != 0){
                int rem = digit % 10;
                temp.add(rem);
                digit = digit / 10;
            }
            // Reverse the temporary list and add to the final list
            for (int j = temp.size() - 1; j >= 0; j--) {
                digitList.add(temp.get(j));
            }
        }

        int[] newArr = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            newArr[i] = digitList.get(i);
        }
        return newArr;
    }
}
