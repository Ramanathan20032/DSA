package BinarySearch;

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num){
        int start = 0;
        int end = num;
        while (start <= end){
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if(square == num){
                return true;
            }
            else if(square > num){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
