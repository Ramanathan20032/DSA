package BinarySearch;

// return Exact square (or) less than the square.

public class SquareX_69 {
    public static void main(String[] args) {
        int x = 65;
        System.out.println(squareLessThanEqualToX(x));
    }
    static int squareLessThanEqualToX(int x){
        int start = 0;
        int end = x;
        while (start <= end){
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if(square == x){
                return mid;
            }
            // mid * mid is greater than x, it means mid is too large, so we move end to mid - 1
            else if(square > x){
                end = mid - 1;
            }
            // mid * mid is less than x, it means mid is too small, so we move start to mid + 1
            else{
                start = mid + 1;
            }
        }
        // If the exact square root is not found, the loop will exit when start exceeds end, and we return end as the integer part of the square root.
        return end;
    }
}
