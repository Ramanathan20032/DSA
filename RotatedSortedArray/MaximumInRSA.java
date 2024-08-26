package RotatedSortedArray;

public class MaximumInRSA {
    public static void main(String[] args) {
//        int[] arr = {6, 7, 1, 2, 4, 5};
        int[] arr = {1, 2, 3, 4, 6, 9};
        System.out.println(findMax(arr));
//        int[] arr1 = {5, 5, 5, 5, 5, 6, 7, 8, 8, 8, 8, 1, 1, 1 , 2, 3, 3, 5};
        int[] arr1 =  {0, 1, 4, 4, 5, 6, 7};
        System.out.println(findMaxWithDuplicates(arr1));
    }
    static int findMax(int[] arr){
        int pivot = findPivot(arr);
        if(pivot == -1){
            // if pivot = -1, arr is not rotated. return last element
            return arr[arr.length - 1];
        }
        // return largest(pivot)
        return arr[pivot];
    }
    static int findMaxWithDuplicates(int[] arr1){
        int pivot = findPivotWithDuplicates(arr1);
        if(pivot == -1){
            // if pivot = -1, arr is not rotated. return last element
            return arr1[arr1.length - 1];
        }
        // return largest(pivot)
        return arr1[pivot];
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                if(start < end && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(end > start && arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
