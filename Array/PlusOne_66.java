package Array;

// https://leetcode.com/problems/plus-one 

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        int[] result = addOne(arr);
        System.out.println(result);
    }
    static int[] addOne(int[] arr){
        for (int i = arr.length - 1; i >= 0; i++) {
            // If the digit is less than 9, increment and return the array.
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            // If digit is 9, set it to 0 and move to the next significant digit.
            arr[i] = 0;
        }

        // If all digits were 9, create a new array with one more size and set the first element to 1.
        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
