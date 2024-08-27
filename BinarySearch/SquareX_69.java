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
            else if(square > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
