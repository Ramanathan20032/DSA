package Array;

//https://leetcode.com/problems/happy-number

public class HappyNumber_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(81));
    }
    static boolean isHappy(int n){
        // This loop of numbers includes 4, 16, 37, 58, 89, 145, 42, 20, and then back to 4.
        while (n != 1 && n != 4){
            int sum = 0;
            while (n > 0){
                int rem = n % 10;
                sum = sum + (rem * rem);
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
