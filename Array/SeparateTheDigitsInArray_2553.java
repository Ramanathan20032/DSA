package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateTheDigitsInArray_2553 {
    public static void main(String[] args) {
        int[] arr = {13 ,25 ,83 ,77};
        int[] result = separateDigits(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] separateDigits(int[] arr){
        ArrayList<Integer> digitsList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i];

            ArrayList<Integer> temp = new ArrayList<>();
            while (digit != 0){
                int rem = digit % 10;
                temp.add(rem);
                digit = digit / 10;
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                digitsList.add(temp.get(j));
            }
        }
        int[] newArr = new int[digitsList.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = digitsList.get(i);
        }
        return newArr;
    }
}
