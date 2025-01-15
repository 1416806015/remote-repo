package algorithm.day5;

public class demo23 {
    public static void main(String[] args) {
        demo23 solution = new demo23();
        System.out.println(solution.mySqrt(10));
    }

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 使用 long 避免 mid * mid 溢出
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
